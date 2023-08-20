package org.example;

public class ABC {

  public static void main(String[] args) {
    System.out.println("hello hello");

    // widening casting
    System.out.println("widening casting----------------------------");
    int Myint = 10;

    double MyDouble = Myint;
    System.out.println(MyDouble);

    //narrowing casting
    System.out.println("narrowing casting---------------------");
    double myDouble = 5.99;
    int myint = (int) myDouble;
    System.out.println(myint);

    //java strings
    System.out.println("Java Strings -------------------------");

    String mystr = "abcd";
    System.out.println(mystr.length());
    System.out.println(mystr.concat("ABCD"));

    String firstName = "Agharda";
    String lastName = "Madhi";
    System.out.println(firstName.concat(lastName));

    //java math
    System.out.println("Java MAth-------------------------------");
    System.out.println("Square: " + Math.sqrt(9));
    System.out.println("Round: " + Math.round(2.6));
    System.out.println("Random: " + Math.random());
    System.out.println("1 To degrees: " + Math.toDegrees(1));
    System.out.println("10 To degrees: " + Math.toDegrees(10));

    if (10 * (Math.toDegrees(1)) == Math.toDegrees(10)) {
      System.out.println("Assertion passed");
    } else {
      System.out.println("Assertion failed");
    }
    System.out.println("Max : " + Math.max(5, 9));


  }

}
