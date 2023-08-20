package org.projectJavaTraining.mypractice;

import java.util.Scanner;

public class basiccalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// building a simple basic calculator
		
		try (Scanner key = new Scanner(System.in)) {
			System.out.println("enter in first number :") ;
			double num1=key.nextDouble();
			System.out.println("enter in second number :") ;
			double num2=key.nextDouble();
			
			System.out.println(num1 * num2);
		}
	}

}
