package org.java2019;

public class Method_Overloading {

  static int plusMethod (int a, int b) {
    return a + b;
  }

  static double plusMethod(double a, double b){
    return a+b;
  }





  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }





  public static void main(String[] args) {
    System.out.println( plusMethod(4,5));
    System.out.println(plusMethod(4.2, 5));

    // in the parameters if i supply an integer it will call the int method,
    // if  i supply a double it will call the double method


    int result = sum(4);     //it means 4 + (3+2+1)  =10
    System.out.println(result);
  }
}
