package org.java2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayList_Examples {

  public static void main(String[] args) {

    ArrayList<String> cars = new ArrayList<String>();
    // add items to the array list
    cars.add("Chevrolet");
    cars.add("Toyota");
    cars.add("Honda");
    cars.add("BMW");
    cars.add("Audi");
    cars.add("renault");
    System.out.println(cars);

    // to remove an item from the array list
    cars.remove("Toyota");
    System.out.println(cars);
    // get a specific item by index
    System.out.println(cars.get(0));

    // to change an item we use this
    cars.set(0, "Ford");
    System.out.println(cars);

    // loop through the array list
    System.out.println("-------loop through the array list------");
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }

    // loop through it using the for each clause
    System.out.println("----------loop using for each ---------");
    Collections.sort(cars);     // here we are sorting the cars by alphabetical order
    for (String i : cars) {
      System.out.println(i);
    }

    // use the itterartor object to itterate through the arraylist
    System.out.println("---------using the iterator-----------");

    Iterator<String> it = cars.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }





    LinkedList<String> names = new LinkedList<String>();
    // add items to the array list
    names.add("agharda");
    names.add("madhi");
    names.add("winath");
    names.add("thinath");
    names.add("said");
    names.add("omar");
    names.addFirst("amchich");
    names.add(1, "ayazidh");
    names.add(1, "avou3emar");
    System.out.println(names);

    System.out.println("-------loop through the linkedList------");
    for (String i : names) {
      System.out.println(i);
    }

    System.out.println("------------loop throug the linkedList using j--------");
    for (int j = 0; j < names.size(); j++) {
      System.out.println(names.get(j));
    }

  }
}