package org.projectJavaTraining.Arrays;

public class Array {

  public static void main(String[] args) {

    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) {
      System.out.println(i);
    }


    String[] mycars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (int i = 0; i < cars.length; i++) {
      System.out.println(mycars[i]);
    }
  }
}
