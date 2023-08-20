package org.unit.practiceAlgorithm;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 */

import org.testng.annotations.Test;

import java.util.Arrays;


public class TwoSum {

    @Test(groups = "Unit")
    public void sum11() {
        int[] arr = {2, 11, 7, 15};
        int target = 9;
        int[] result = findIndexOfNumber(arr, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findIndexOfNumber(int[] nums, int target) {
        if (nums.length <= 1) {
            return new int[]{0, 0};
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }


    /*public static int[] findIndexOfNumber1(int nums[], int target) {
        if (nums.length <= 1) {
            return new int[]{0, 0};
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                // check target - nums[i] exists in array or not
                for (int j = i + 1; j < nums.length; j++) {
                    if ((target - nums[i]) == nums[j]) {
                        return new int[]{i, j};
                    }
                }

            }
        }
        return new int[]{0, 0};
    }*/

}
