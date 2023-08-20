package org.java2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

  // this is how a constructor works in arraylist
  public static void main(String[] args) {

    String array[] = {"ford", "vw", "toyota", "honda", "bmw"};
    List<String> list = Arrays.asList(array);
    ArrayList<String> c = new ArrayList<>(list);
    c.add("mercedes");
    c.add("daewoo");
    for (String s : c) {
      System.out.println("array list c element is : " + s);
    }
    System.out.println(c);

  }

  //methods of arraylist
  //add

}
