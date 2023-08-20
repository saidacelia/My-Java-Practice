package org.java2020;

public class RrturnStatements {

  static int a = 65324;
  static int b = 6484;
  static int c = 6464;
  static int d = 98521;
  static int sum = a + b + c + d;

  public static void main(String[] args) {
    //int num = 3;
    System.out.println(cube(5));
    System.out.println(average());
  }


  public static int cube(int numberToCube) {
    return (numberToCube * numberToCube * numberToCube);
  }


  public static int average() {
   int averageOfNumbers = sum / 4;
    return averageOfNumbers;
  }

}
