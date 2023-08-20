package org.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        java.util.Date d = new java.util.Date();

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy  hh:mm:ss");
        System.out.println(sdf2.format(cal.getTime()));

        System.out.println("day of week in month: "+cal.get(+Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("week of month: "+cal.get(Calendar.WEEK_OF_MONTH));

        System.out.println("day of year: "+cal.get(Calendar.DAY_OF_YEAR));


    }


}
