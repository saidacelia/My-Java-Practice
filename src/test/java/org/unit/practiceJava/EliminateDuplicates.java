package org.unit.practiceJava; /*  Created By  Lyes  on 3/30/2021 , at 10:07 PM  */

import org.testng.annotations.Test;

import java.util.ArrayList;

public class EliminateDuplicates {

    @Test
    public void test1() {
        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(1);
        nums.add(3);
        nums.add(4);
        nums.add(3);
        ArrayList<String>names=new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        names.add("a");
        names.add("b");
        names.add("c");

        System.out.println(removeDups(nums));
        System.out.println(removeDups(names));

    }

    public static <E extends Comparable<E>> ArrayList<E> removeDups(ArrayList<E> list) {
        boolean found = false;
        if (list.size() == 0)
            return list;
        ArrayList<E> newList = new ArrayList<>();
        //newList.add(list.get(0));
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < newList.size(); j++) {
                if (list.get(i).compareTo(newList.get(j)) == 0) {
                    found = true;
                    break;
                }
            }
            if (!found)
                newList.add(list.get(i));
            found = false;
        }

        return newList;
    }


}
