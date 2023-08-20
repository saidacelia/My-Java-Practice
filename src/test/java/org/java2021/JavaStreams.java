package org.java2021; /*  Created By  Lyes  on 2/22/2021 , at 11:36 PM  */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("1 hi");
        list.add(2);
        list.add(3);
        list.add("1 hello");
        list.add("hi 1");
        list.add("there 3");

        List listHI = list.stream().filter(a -> a.toString().contains("hi")).collect(Collectors.toList());
        System.out.println(listHI);

        List list1= list.stream().filter(a->a.toString().contains("1")).collect(Collectors.toList());
        System.out.println(list1);

        List list2= list.stream().filter(a->a.toString().contains("3")).collect(Collectors.toList());
        System.out.println(list2);

    }

}
