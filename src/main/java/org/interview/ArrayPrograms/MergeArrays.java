package org.interview.ArrayPrograms;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6, 7, 8};
        mergeArrays(a, b);

    }

    public static void mergeArrays(int[] array1, int[] array2) {

        int[] mergedArray = new int[array1.length + array2.length];

        int counter = 0;

        for (int i = 0; i < array1.length; i++) {
            mergedArray[counter] = array1[i];
            counter++;
        }

        for (int i = 0; i < array2.length; i++) {
            mergedArray[counter] = array2[i];
            counter++;
        }

        System.out.println("Merged array => " + Arrays.toString(mergedArray));

    }


}
