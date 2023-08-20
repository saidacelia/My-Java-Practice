package org.java2019;

public class Arrays {

  public static void main(String[] args) {

    System.out.println("-----------loop through an array with for each--------");
    String [] names = {"bicha", "celia", "moudits", "joudits"};
    System.out.println(names.length);
    for (String i : names){
      System.out.println(i);
    }
    System.out.println("------print by index--------");
    System.out.println(names[0]);
    System.out.println(names.length);

    System.out.println("------change an array element-------");
    names[1]="Thacelyats";
    System.out.println(names[1]);



    //loop through the array
    System.out.println("-------------loop through the array---------------------");
    for (int i=0;i<names.length;i++){
      System.out.println(names[i]);
    }





  }
}