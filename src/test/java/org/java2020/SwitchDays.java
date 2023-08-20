package org.java2020;

public class SwitchDays {

  public static void main(String[] args) {

    System.out.println(getDayName(1));

  }

  public static String getDayName(int dayNum) {
    String dayName = "";

    switch (dayNum) {
      case 1:
        dayName = "Monday";
        break;
      case 2:
        dayName = "Tuesday";
        break;
      case 3:
        dayName = "Wednesday";
        break;
      case 4:
        dayName = "Thursday";
        break;
      case 5:
        dayName = "Friday";
        break;
      case 6:
        dayName = "Saturday";
        break;
      case 7:
        dayName = "Sunday";
        break;
      default:
        dayName = "invalid day number";
        break;
    }

return dayName;
  }
}
