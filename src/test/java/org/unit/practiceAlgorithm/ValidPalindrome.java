package org.unit.practiceAlgorithm;
/*
Input: "A man, a plan, a canal: Panama"
Output: true
 */

import org.testng.annotations.Test;

public class ValidPalindrome {

    @Test(groups = "Unit")
    public  void palindromeTest(){
        String s = "A man, a plan, a canal: Panama";
        boolean isPalin = isPalindrome(s);
        System.out.println(isPalin);
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        boolean flag = false;
        if (s.trim().length() == 0) {
            flag = true;
        } else {
            String newString = s.toLowerCase().replaceAll("[^a-zA-Z0-9+]", "");
            System.out.println("String after removing special chars => " + newString);
            StringBuilder reverseString = new StringBuilder(newString);
            reverseString = reverseString.reverse();
            System.out.println("Reverse string => " + reverseString);
            System.out.println();
            flag = newString.equalsIgnoreCase(String.valueOf(reverseString));
        }
        return flag;
    }

}
