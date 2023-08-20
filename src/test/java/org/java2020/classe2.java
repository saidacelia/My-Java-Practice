package org.java2020;

public class classe2 {
// working with 2D aqrray
public static void main(String[] args) {
classe2.array1();

}

  public static void array1(){
int numbers[][]= {
    {11,22,33,44,55,66},
    {77,88,99,100,110,120},
    {130,140,150,160,170,180,190}};
    //System.out.println("array1 = " + numbers[0][0]);


    // to read everything in the 2d array

    for(int i=0; i<numbers.length;i++){
      for(int j=0; j<numbers[i].length; j++){
        System.out.print(numbers[i][j]+ " ");
      }
      System.out.println();
    }
  }

}
