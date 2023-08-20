package org.unit.practiceAlgorithm;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 */

    @Test(groups = "Unit")
    public void maj() {
        int[] arr = {3, 2, 3};
        int num = majorityElement(arr);
        System.out.println(num);
    }

    public static int majorityElement(int[] arr) {
        // using map
        int countForMajority = arr.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        for (int num : map.keySet()) {
            if (map.get(num) > countForMajority) {
                return num;
            }
        }
        return 0;
    }


}
