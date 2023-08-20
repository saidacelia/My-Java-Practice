package org.unit.practiceAlgorithm;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Resultt {

    public static boolean isAnagram(String firstString, String secondString) {

        int first = firstString.length();
        int second = secondString.length();

        if (first != second) {
            return false;
        }

        char[] firstChar = firstString.toCharArray();
        char[] secondChar = secondString.toCharArray();
        Arrays.sort(firstChar);
        Arrays.sort(secondChar);

        System.out.println(firstChar);
        System.out.println(secondChar);
        return Arrays.equals(firstChar, secondChar);


    }

    @Test(groups = "Unit")
    public void resutl() {
        boolean a = isAnagram("sprint", "prints");
        System.out.println(a);
    }
}


