package com.gmail.maxenamiro;

import java.util.Scanner;

public class thirdTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть елемент для пошуку: ");
		int a = sc.nextInt();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		System.out.println("Індекс масиву : " + Search(arr, a));
	}

	public static int Search(int[] arr, int x) {
		int exc = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				exc = i;
			}
		}
		return exc;
	}

}
