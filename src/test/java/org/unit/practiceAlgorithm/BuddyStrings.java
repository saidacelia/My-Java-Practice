package org.unit.practiceAlgorithm;

import org.testng.annotations.Test;

public class BuddyStrings {

    @Test(groups = "Unit")
    public void buddystrings() {

        String a = "aaaaaaabc";
        String b = "aaaaaaacb";
        boolean result = buddyStrings(a, b);
        System.out.println(result);
    }


    public static boolean buddyStrings(String a, String b) {
        boolean flag = false;
        if (a.equals(b)) {
            flag = false;
        } else if (a.length() == b.length() && a.length() <= 2) {
            flag = true;
        }


        return flag;
    }

}
