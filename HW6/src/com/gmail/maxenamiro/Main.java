package com.gmail.maxenamiro;

public class Main {

	public static void main(String[] args) {
		int[] array = new int[] { 1, -9, 6, 3 };

		int max = Max(array);
		System.out.println(max);
	}

	public static int Max(int[] array) {
		int tecushiuMax = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > tecushiuMax) {
				tecushiuMax = array[i];
			}
		}
		return tecushiuMax;

	}
}