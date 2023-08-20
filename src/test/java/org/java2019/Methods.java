package org.java2019;

public class Methods {


  static void method_OneParameter(String name){
    System.out.println("My name is : " + name);
  }

  static void method_TwoParameters(String name, int age){
    System.out.println("My name is : "+name + " and My age is : "+ age);
  }


  //A method with if else
  static void checkAge(int age){
    if (age<18){
      System.out.println("you are not old enough");
    }else{
      System.out.println("go in you are fine");
    }
  }



  public static void main(String[] args) {
    System.out.println("------------1 parameter------------");
    method_OneParameter("Omar");
    method_OneParameter("John");
    method_OneParameter("Agharda");

    System.out.println("-------------2 parameters--------------");
    method_TwoParameters("celia", 1);
    method_TwoParameters("Agharda", 100);

    System.out.println("---------check age----------");
    checkAge(20);

  }


}
