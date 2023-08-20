package org;

import java.util.Arrays;

public class Resultt {

    public static boolean isAnagram(String firstString, String secondString) {

        int first = firstString.length();
        int second = secondString.length();

        if (firstString != secondString) {
            return false;
        }

        char[] firstChar= firstString.toCharArray();
        char[] secondChar= secondString.toCharArray();
        Arrays.sort(firstChar);
        Arrays.sort(secondChar);

        return Arrays.equals(firstChar, secondChar);
    }
}
