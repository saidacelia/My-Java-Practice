package org.java2020;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class CustomArrayList {

  int i, n = 6;

  class StudentsData {

    int roll;
    String name;
    int marks1;
    int marks2;
    int marks3;
    long phone;

    StudentsData(int roll, String name, int marks1, int marks2, int marks3, long phone) {
      this.roll = roll;
      this.name = name;
      this.marks1 = marks1;
      this.marks2 = marks2;
      this.marks3 = marks3;
      this.phone = phone;
    }
  }


  public static void main(String[] args) {
    int roll[] = {1, 2, 3, 4, 5, 6};
    String name[] = {"omar", "ali", "abka", "said", "samir", "rabah"};
    int marks1[] = {12, 10, 5, 15, 13, 10};
    int marks2[] = {12, 10, 7, 9, 8, 15};
    int marks3[] = {9, 16, 12, 10, 7, 5};
    long phone[] = {125445554L, 215665112L, 267776667L, 6106106102L, 267878987L, 267665225L};

    CustomArrayList ca = new CustomArrayList();
    ca.addValues(roll, name, marks1, marks2, marks3, phone);

  }
  
  public void addValues(int roll[], String name[], int marks1[], int marks2[], int marks3[], long phone[]) {
ArrayList list= new ArrayList();
    for (int i = 0; i < n; i++) {
      list.add(new StudentsData(roll[i], name[i], marks1[i], marks2[i], marks3[i], phone[i]));
    }
    printValues(list);
  }

  public void printValues(ArrayList<Data> list) {
    System.out.println("roll- name - marks1 - marks2 - marks3 - phone");
    for (i = 0; i < n; i++) {
      StudentsData data = (StudentsData) list.get(i);

      System.out.println(data.roll + "  -  " + data.name + "  -  " + data.marks1 + "  -  " + data.marks2 + "  -  " + data.marks3 + "  -  " + data.phone);
    }

  }
}
