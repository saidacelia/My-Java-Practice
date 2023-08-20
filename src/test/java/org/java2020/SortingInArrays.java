package org.java2020;

public class SortingInArrays {


  int[][] num2 = {
      {244, 42, 32},
      {82, 24, 24},
      {25, 9102, 4022}
  };
  int[][] num3 = {
      {93, 33, 83},
      {343, 36324, 543},
      {3534, 435343, 43563}
  };


  public static void bubbleSort(int num1[]) {
    int len = num1.length;
    for (int i = 0; i < len - 1; i++) {
      for (int j = 0; j < len - i - 1; j++) {
        //swap the adjacent element
        if (num1[j] > num1[j + 1]) {
          int temp = num1[j];
          num1[j] = num1[j + 1];
          num1[j + 1] = temp;

        }
      }
    }

  }


  public static void main(String[] args) {
    int[] num1 = {1544, 10, 1, 153, 156, 88, 5 , 6 ,-8};
    SortingInArrays.bubbleSort(num1);
    for(int ele : num1){
      System.out.print(ele+ " ");
    }
  }


}
