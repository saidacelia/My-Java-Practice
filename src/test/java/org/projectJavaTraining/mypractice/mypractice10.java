package org.projectJavaTraining.mypractice;

public class mypractice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//nested loops and 2d arrays
		
		/*
		for(int i=1; i<4; i++) {
			for (int j=1; j<5; j++) {System.out.println("i = " + i + " ... j = " + j);}   */
		
		
		
		int [][] numgrid = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		
		for (int i=0; i<numgrid.length; i++) {
			for (int j=0; j<numgrid[i].length; j++) { System.out.print(numgrid[i][j]);}
		
			System.out.println();
		}
		
		
		
		
		
		}
		
	}


