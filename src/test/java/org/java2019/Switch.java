package org.java2019;

public class Switch {

  public static void main(String[] args) {
    int a = 4;
    int b = 4;
    switch (a) {
      case 1:
        System.out.println("number 1");
        break;
      case 2:
        System.out.println("number 2");
        break;
      case 3:
        System.out.println("number 3");
        break;
      case 4:
        System.out.println("number 4");
        break;
      case 5:
        System.out.println("number 5");
        break;
      default:
        System.out.println("enter a number less than or equal to a");

    }

    switch (b) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("enter a number between 1 and 7");
    }

  }
}
