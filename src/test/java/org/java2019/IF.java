package org.java2019;

public class IF {

  public static void ifELseExample() {

    int a = 8;
    int b = 10;

    if (a > b) {
      System.out.println("a is bigger");
    } else {
      System.out.println("b is bigger");
    }
  }


  public static void elseIFExample(){
    int a=7;
    int b=9;
    int c= 23;

    if (a>b &&a>c){
      System.out.println("a is bigger");
    }else if(b>a&&b>c){
      System.out.println("b is bigger");
    }else{
      System.out.println("c is bigger.");
    }

  }




  public static void main(String[] args) {
    IF.ifELseExample();
    IF.elseIFExample();
  }
}