package com.algo.search;

public class ArrayLeftShiftExample1 {
	
	public static void main(String[] args) {

        int[] x = { 1, 2, 3, 4, 5, 6 };
        ArrayLeftShiftExample1 test = new ArrayLeftShiftExample1();
        x = test.shiftArray(x, 2);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }

    public int[] pushFirstElementToLast(int[] x, int position) {
        int temp = x[0];
        for (int i = 0; i < x.length - 1; i++) {
            x[i] = x[i + 1];
        }
        x[x.length - 1] = temp;
        return x;
    }

    public int[] shiftArray(int[] x, int position) {
        for (int i = position - 1; i >= 0; i--) {
            x = pushFirstElementToLast(x, position);
        }
        return x;
    }
}
