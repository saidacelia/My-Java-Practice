package org.java2020;

import java.util.Scanner;

public class classe1 {

  public static void main(String[] args) {
    classe1 cls = new classe1();
    cls.array2();
    //cls.scanner();

  }

  public static void scanner() {
    Scanner keyBoardInput = new Scanner(System.in);
    System.out.print("enter your name : ");
    String name = keyBoardInput.nextLine();
    System.out.print("enter your age: ");
    int age = keyBoardInput.nextInt();
    System.out.println("hello " + name + " , you are " + age + " years old.");


  }

  public void array1() {
    String[] friends = new String[5];
    friends[0] = "ali";
    friends[1] = "mike";
    friends[2] = "tom";
    friends[3] = "steve";
    friends[4] = "said";
    System.out.println("Length of the array: " + friends.length);

    for (int i = 0; i < friends.length; i++) {
      System.out.println("frinds[" + i + "] is : " + friends[i]);
    }
    for (String element : friends) {
      System.out.println("element friends:  " + element);
    }
  }


  public void array2() {
    int[] numbers = new int[5];
    numbers[0]=25;
    numbers[1]=65;
    numbers[2]=455;
    numbers[3]=48;
    numbers[4]=77;
    for (int i =0;i<numbers.length;i++){
      System.out.println("numbers at index ["+i+"] : "+ numbers[i]);
    }
int count=0;
    for(int num:numbers){
      count= count + num;
      System.out.println(count);
    }
    System.out.println("the count is : "+ count);
  }


}
