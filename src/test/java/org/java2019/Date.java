package org.java2019;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date {

  public static void main(String[] args) {
    LocalDate localDate = LocalDate.now(); // Create a date object
    System.out.println(localDate); // Display the current date

    LocalTime time= LocalTime.now();
    System.out.println(time);

    LocalDateTime localDateTime=LocalDateTime.now();
    System.out.println("Before formatting : "+localDateTime);

    // this is how we can format the date and time

    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMM/dd/yyyy   HH:mm:ss");

    String formattedDate = localDateTime.format(myFormatObj);
    System.out.println("After formatting : " + formattedDate);

  }


}
