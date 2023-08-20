package org.java2020;

public class SearchInArray {

// 2 methods linear and binary search
  public static int linearSearch(int[] numbers, int elm) {
    int index = -1;
    for(int i=0;i<numbers.length;i++){
      if(elm==numbers[i]){
        index=i;
        break;
      }
    }

    return index;
  }




  public static void main(String[] args) {
    int[] numbers = {1, 5, 33, 10, 88, 57, 6, 9, 2};
    int element = 5;

    int foundIndex=SearchInArray.linearSearch(numbers, element);
    if(foundIndex != -1){
      System.out.println("elemet "+"("+element+")"+" found at "+ foundIndex+ " index");
    }else{
      System.out.println("element "+"("+element+")"+ " not found in the array!!!!");
    }
  }
}
