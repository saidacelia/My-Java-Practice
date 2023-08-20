package org.projectJavaTraining.mypractice;

public class mypractice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(max(1,5,9));
		
	
	}
	//this is to use if statement and to return the biggest number
	//we will create another method called max
	
	public static int max(int num1, int num2, int num3) {
		
		if(num1>num2 && num1>num3) {return num1;}
		else if(num2>num1 && num2>num3) { return num2;}
		else {return num3;}
		

	}
}
