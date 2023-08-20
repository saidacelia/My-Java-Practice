package org.java2020;

import java.util.ArrayList;

public class arrayListExample2 {

  public static void main(String[] args) {

    ArrayList al =new ArrayList();
    al.add("mmmmicha");
    al.add("micha");
    al.add("celia");
    al.add("mimich");
    System.out.println("array after adding objects : " + al+ " ,size is : "+ al.size());

    al.remove("micha");
    System.out.println("array after deleting objects : " + al+ " ,size is : "+ al.size());

    al.clear();
    System.out.println("array after clearing objects : " + al+ " ,size is : "+ al.size());


  }



}
