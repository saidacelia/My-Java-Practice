package org.unit.practiceAlgorithm;

/*
Given a binary array, find the maximum number of consecutive 1s in this array.
 */

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class MaxConsecutiveOnes {

    @Test(groups = "Unit")
    public  void max1() {
        int[] arr = {1, 0, 1, 1, 0, 1};
        int count = findMaxConsecutiveOnes(arr);
        System.out.println(count);
    }

    public static int findMaxConsecutiveOnes(int[] arr) {
        int counter = 0;
        int maxCount = 0;
        Set<Integer> set = new HashSet<>();
        set.add(1);                // adding 1 in order to get count till the time add() returns false
        for (int i = 0; i < arr.length; i++) {
            int currentNumber = arr[i];
            if (currentNumber == 1 && !set.add(currentNumber)) {
                counter++;
                if (counter >= maxCount) {
                    maxCount = counter;
                }
            } else {
                counter = 0;
                continue;
            }
        }
        return maxCount;
    }
}
