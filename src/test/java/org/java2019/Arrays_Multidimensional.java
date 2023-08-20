package org.java2019;

public class Arrays_Multidimensional {

  public static void main(String[] args) {

    int [][] numbers={{1,2,3,4},{2,3,5}};
    System.out.println("--------access by index----------");
    System.out.println(numbers[1][1]);



    // loop through the array using for loop
    System.out.println("------------loop through the array using for loop----------");

    for(int i=0;i<numbers.length;i++){
      for(int j=0; j<numbers[i].length;j++){
        System.out.print(numbers[i][j]);
      }
      System.out.println(" ");
    }



    String [][]names={{"Agharda", "Amchich", "Ayazidh"},{"Aqejoun", "Adouberman"}};
  for (int i = 0; i<names.length;i++){
    for (int j=0; j<names[i].length;j++){
      System.out.print(names[i][j]+" - ");
    }
    System.out.println(" ");
  }

  }




}
