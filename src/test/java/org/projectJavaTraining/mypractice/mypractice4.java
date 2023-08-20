package org.projectJavaTraining.mypractice;

public class mypractice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(cube(3));
		
	}

	//we create another method inside the package mypractice and we call it cube
	// we call the method using cube(); 
	//when we run the program java will execute the method that we called
	
	public static int cube (int numtocube)  {
		
		return (numtocube * numtocube * numtocube);
		
	};
}
