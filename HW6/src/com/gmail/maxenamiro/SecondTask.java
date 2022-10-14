package com.gmail.maxenamiro;

import java.util.Scanner;

public class SecondTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введіть ширину: ");
		int shirina = sc.nextInt();
		
		System.out.println("Введіть висоту: ");
		int visota = sc.nextInt();
		
		rectAngle(shirina, visota);
	}

	private static void rectAngle(int a, int b) {
		for (int i = 1; i <=b; i++) {
			for (int j = 1; j <=a; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}		
	}

}
