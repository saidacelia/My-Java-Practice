package org.unit.practiceAlgorithm;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ReverseArrayOfChars {

    @Test(groups = "Unit")
    public void reversess() {

        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        reverseString(arr);
    }

    public static void reverseString(char[] s) {
        // iterate till half and swap elements
        char temp = 'a';
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(s));
    }

}
