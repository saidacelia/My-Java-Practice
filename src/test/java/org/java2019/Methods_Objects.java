package org.java2019;

public class Methods_Objects {
int a= 5;

  public static void main(String[] args) {

    Methods_Objects method=new Methods_Objects();
    System.out.println(method.a);
    // changed the attribute a   //overriding existing values
    method.a=6;
    System.out.println(method.a);
  }

}
