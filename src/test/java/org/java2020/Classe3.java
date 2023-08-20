package org.java2020;

public class Classe3 {

  public static void main(String[] args) {

    int[][] num1 = {
        {1, 1, 1},
        {1, 1, 1},
        {1, 1, 1}
    };
    int[][] num2 = {
        {2, 2, 2},
        {2, 2, 2},
        {2, 2, 2}
    };
    int[][] num3 = {
        {3, 3, 3},
        {3, 3, 3},
        {3, 3, 3}
    };
    System.out.println("------num1-------");
    for (int i = 0; i < num1.length; i++) {
      for (int j = 0; j < num1[i].length; j++) {
        System.out.print(num1[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("------num2-------");
    for (int i = 0; i < num2.length; i++) {
      for (int j = 0; j < num2[i].length; j++) {
        System.out.print(num2[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("------num3-------");
    for (int i = 0; i < num3.length; i++) {
      for (int j = 0; j < num3[i].length; j++) {
        System.out.print(num3[i][j] + " ");
      }
      System.out.println();
    }

//fo addition we use this techenique
    System.out.println("------addition-------");
    int [][]add= new int[3][3];
for(int i=0;i<add.length;i++){
  for(int j=0; j<add[i].length;j++){
    add[i][j]=num1[i][j]+num2[i][j]+num3[i][j];
    System.out.print(add[i][j]+" ");
  }
  System.out.println();
}


  }
}
