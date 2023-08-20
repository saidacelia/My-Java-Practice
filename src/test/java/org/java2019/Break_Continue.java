package org.java2019;

public class Break_Continue {

  public static void main(String[] args) {

    for (int i = 0; i < 7; i++) {
      if (i == 4) {
        break;
      }
      System.out.println(i);
    }

    System.out.println(" this line is here to separate the 2 statements, that's all");

    for (int b = 0; b < 5; b++) {
      if (b == 2) {
        continue;
      }
      System.out.println(b);
    }

//in the above example , the execution skipped number 2

//break in  a while loop
    System.out.println("break in  a while loop");
    int i = 0;
    while (i < 10) {
      System.out.println(i);
      i++;
      if (i == 4) {
        break;
      }
    }


//continue in a while loop
    System.out.println("continue in a while loop");

    int c = 0;
    while (c < 10) {
      if (c == 4) {
        c++;
        continue;
      }
      System.out.println(c);
      c++;
    }

  }
}
