package org.example;

import java.text.SimpleDateFormat;

public class Date {

    public static void main(String[] args) {
        java.util.Date d = new java.util.Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy     hh-mm");
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy  hh:mm:ss");

        System.out.println(d.toString());
        System.out.println(sdf1.format(d));
        System.out.println(sdf2.format(d));
    }
}
