package org.unit.practiceAlgorithm;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SortStringOverLength {
    @Test(groups = "Unit")
    public void sort() {
        String[] arr = {"Jan", "Feb", "March", "April", "May"};
        sortViaLength(arr);
        sortAlphabeticallyViaComparator(arr);
    }


    public static void sortAlphabeticallyViaComparator(String[] arr) {

    }

    // Complexity O(n2), worst way
    public static void sortViaLength(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i].length() > arr[j].length()) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Strings after sorting via length => " + Arrays.toString(arr));
    }


}
