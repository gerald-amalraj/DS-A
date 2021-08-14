package com.algo.search;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Trie {

	private class TrieNode {
		Map<Character, TrieNode> children;
		boolean endOfWord;

		public TrieNode() {
			children = new HashMap<>();
			endOfWord = false;
		}
	}

	public TrieNode root;

	Trie() {
		root = new TrieNode();
	}

	public void insert(String word) {
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode node = current.children.get(ch);
			if (node == null) {
				node = new TrieNode();
				current.children.put(ch, node);
			}
			current = node;
		}

		current.endOfWord = true;
	}

	public boolean search(String word) {
		TrieNode current = root;

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);

			TrieNode node = current.children.get(ch);
			if (node == null) {
				return false;
			}
			current = node;
		}

		return current.endOfWord;
	}

	public static void printAllWordsInTrie(TrieNode root, String s) {
		System.out.println(">>>>>>:::: "+s.length());
		
		TrieNode current = root;
		if (root.children == null || root.children.size() == 0)
			return;
		Iterator iter = current.children.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<Character, TrieNode> entr = (Map.Entry) iter.next();

			TrieNode node = entr.getValue();
			s += node.children;
			printAllWordsInTrie(node, s);
			if (node.endOfWord == true) {
				System.out.print(" " + s);
				s = s.substring(0, s.length() - 1);
			} else {
				s = s.substring(0, s.length() - 1);
			}
		}
	}

	public static void main(String[] args) {
		Trie trieNode = new Trie();

		trieNode.insert("Jerry");
		trieNode.insert("dear");
		/*trieNode.insert("deal");
		trieNode.insert("do");
		trieNode.insert("he");
		trieNode.insert("hen");
		trieNode.insert("heat");*/

		//System.out.println("hen present in trie : " + trieNode.search("hen"));
		//System.out.println("hear present in trie : " + trieNode.search("hear"));
		System.out.println(" present in trie : " + trieNode.search("ear"));

		trieNode.printAllWordsInTrie(trieNode.root, "");

	}

}
