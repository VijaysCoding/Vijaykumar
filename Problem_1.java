package com.screening;

import java.util.Scanner;

class Calculator{
	public double calculate(double a, double b, String operation) {
		switch(operation.toLowerCase()) {
		case "add":
			return a + b;
		case "substract":
			return a - b;
		case "multiply":
			return a * b;
		case "divide":
			if(b==0) {
				throw new ArithmeticException("Cannot divided by Zero");
			}
			return a / b;
		default:
			throw new IllegalArgumentException("Invalid operation type...");
		}
	}
}
public class Problem_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		double a = sc.nextDouble();
		
		System.out.println("Enter b: ");
		double b = sc.nextDouble();
		
		System.out.println("Enter operation (add/substract/multiply/divide): ");
		String op = sc.next();
		
		Calculator cal = new Calculator();
		double result = cal.calculate(a, b, op);
		
		System.out.println("Result: " + result);
		
		sc.close();

	}

}
