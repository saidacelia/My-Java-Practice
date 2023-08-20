package org.projectJavaTraining.fourth;

public class arraysa {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

		/*
		int studentid[]=new int[100];
		

		
		studentid[0]=100;
		studentid[2]=200;
		studentid[6]=600;
		System.out.println(studentid[2]);
		System.out.println(studentid[50]);
		System.out.println(studentid.length);
		*/

    //array
    int studentid[] = new int[100];
    for (int i = 0; i <= studentid.length; i++) {
      studentid[i] = i * 1;
      System.out.println("studentid (" + i + ") = " + studentid[i]);

      //multidimentional array

//      int teacherid[][] = {{1, 2}, {3, 3, 3, 5}};
//      teacherid[0][0] = 6;
//      teacherid[0][1] = 600;
//      teacherid[0][2] = 6000;
//
//      teacherid[1][0] = 8;
//      teacherid[1][1] = 800;
//      teacherid[1][2] = 8000;
//
//      System.out.println(teacherid[1][1]);
    }
  }
}


