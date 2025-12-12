package com.screening;

import java.util.Scanner;

public class Problem_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int limit = (num % 2 == 0) ? num - 1 : num;
		
		for(int i=1; i<=limit * 2; i += 2) {
			System.out.print(i+",");
		}
		sc.close();
	}

}
