package com.screening;

import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		for(int i=1; i<= num * 2; i +=2) {
			System.out.print(i + ",");
//			if(i < num * 2 -1 )
//				System.out.print(",");
		}
		sc.close();
	}

}
