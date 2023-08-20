package org.projectJavaTraining.mypractice;

import java.util.Scanner;

public class mypractice8 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
Scanner key = new Scanner(System.in)) {
	String secretword="bye";
	String guess = "";
	int guesscount = 0;
	int guesslimit= 3;
	boolean outofguesses = false;
	
	
	while (!guess.equals(secretword) && !outofguesses) {
	
		if (guesscount<guesslimit) {
	System.out.print("enter a guess : ");

	guess= key.nextLine();
	guesscount++;
		} else { outofguesses = true;}
		}
	
		if (outofguesses) {System.out.println("you lose , no more guesses for you");
		}else {System.out.println("you win");}
			
		}}
}