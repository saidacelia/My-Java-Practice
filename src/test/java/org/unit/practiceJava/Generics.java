package org.unit.practiceJava; /*  Created By  Lyes  on 3/30/2021 , at 9:27 PM  */

import org.testng.annotations.Test;

public class Generics {

    @Test
    public void genericMethods() {
        Integer[] ints = {1, 2, 3, 4, 5, 6, 7};
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        Boolean[]bool={true,false};

        print(ints);
        print(days);
        print(bool);
        System.out.println(countGreaterThan(ints, 4));
    }


    public static <E> void print(E[] list) {
        for (E element : list) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }


    public static <T extends Comparable<T>> int countGreaterThan(T[] list, T ele) {
        int count = 0;
        for (T element : list) {
            if (element.compareTo(ele) > 0)
                count++;
        }
        return count;
    }
}
