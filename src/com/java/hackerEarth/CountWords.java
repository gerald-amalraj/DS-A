package com.java.hackerEarth;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWords {

	public static void main(String[] args) {
		String totWrds = "he is a good programmer, he won 865 competitions, but sometimes he dont. What do you think? All test-cases should pass. Done-done?";
         //String totWrds = "jds dsaf lkdf kdsa fkldsf, adsbf ldka ads? asd bfdal ds bf[l. akf dhj ds 878  dwa WE DE 7475 dsfh ds  RAMU 748 dj.";
		
		String[] wrdsToken = totWrds.split(" ");
		int count=0;
	
		String invalidChar = "[0-9]+";
		
		Pattern digits = Pattern.compile("[0-9]+");
		Pattern special = Pattern.compile("[\\[]");
		
		
		
		for(int i=0; i<wrdsToken.length;i++){
			
			Matcher hasDigits = digits.matcher(wrdsToken[i]);
			Matcher hasSpecial = special.matcher(wrdsToken[i]);
			
			if(!wrdsToken[i].isEmpty() && !hasDigits.find() && !hasSpecial.find()){
			//	System.out.println(wrdsToken[i]);
				count++;
			}else{
			//	System.out.println(wrdsToken[i]);
			}
		}
		System.out.println("TotalCount:::: "+count);
		
		/*String str= "bfl.";
		
		Pattern special = Pattern.compile("[\\[]");
		Matcher hasSpecial = special.matcher(str);
		
		System.out.println(hasSpecial.find());*/
	}
	
	
	
	

}
