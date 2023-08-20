package org.projectJavaTraining.mypractice;

import java.util.Scanner;

public class mypractice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key= new Scanner(System.in);
		
		System.out.print("enter a number : ");
		double num1= key.nextDouble();
		
		System.out.print("enter anoperator : ");
		String op= key.next();
		
		System.out.print("enter another number : ");
		double num2= key.nextDouble();
		
		
		if (op.equals("+")) {System.out.println(num1+num2);}
		else if (op.equals("-")) {System.out.println(num1-num2);}
		else if (op.equals("/")) {System.out.println(num1/num2);}
		else if (op.equals("*")) {System.out.println(num1*num2);}
		else System.out.println("invalid operator");
	}
		

}
