package org.unit.practiceAlgorithm;

import org.testng.annotations.Test;

public class NoOfSegments {

    @Test(groups = "Unit")
    public void segms() {

        String s = ", , , ,        a, eaefa";
        countSegments(s);
    }

    public static int countSegments(String s) {
        int count = 0;
        if (s.trim().length() == 0) {
            count = 0;
        } else {
            String[] array = s.split(" ");
            for (int i = 0; i < array.length; i++) {
                if (array[i].trim().length() > 0) {  // only increment count when sub string is not space
                    //    System.out.println("Current substring => " + array[i]);
                    count++;
                }
            }
        }
        System.out.println("No of segments in string  => " + count);
        return count;
    }
}
