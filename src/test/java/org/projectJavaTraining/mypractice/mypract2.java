package org.projectJavaTraining.mypractice;

import java.util.Scanner;

public class mypract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		//this is to create a small program with name and age
		//we can also add more values in this programm
		
		Scanner key = new Scanner(System.in);
		System.out.print("Enter your name ayagharda: ");
		String name= key.nextLine();
		
		System.out.print("enter your age: ");
		int age=key.nextInt();
		
		System.out.println("Hey " + name + " !" + " you are " + age + " years old !");
		System.out.println("next year you will be " + ++age + " years old");
		
	
		
	}

}
