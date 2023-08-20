package org.unit.practiceJava; /*  Created By  Lyes  on 3/10/2021 , at 8:43 PM  */

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {
// A collectiuon is a an API that provides us a set of interfaces and classes

    // List is an interface implemented by : ArrayList, LinkedList

    @Test(groups = "Unit")
    public void hhh() {

        LinkedList<Object> linked = new LinkedList<>();
        //LinkedList internally uses a doubly linked list to store the elements.
        //Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list
        //LinkedList is better for manipulating data.
        // implements List and Deque interfaces
        linked.add("ab");
        linked.add("abc");
        linked.add("ab");
        linked.add(3);
        linked.add("k");
        linked.add(1, 5);
        linked.addFirst("q");
        linked.addLast("s");

        System.out.println(linked);


        ArrayList<Object> aray = new ArrayList<>();
        //ArrayList internally uses a dynamic array to store the elements.
        //Manipulation with ArrayList is slow because it internally uses an array.
        // ArrayList is better for storing and accessing data.
        aray.add(1);
        aray.add("hh");
        aray.add(true);
        aray.add(null);
        aray.add(1);
        aray.add(null);

        System.out.println(aray);


        ArrayList<String>names=new ArrayList<>();
        names.add("joe");
        names.add("yee");
        names.add("ali");
        names.add("kim");

        System.out.println(names);

        List sortedNames= names.stream().sorted().collect(Collectors.toList());
        sortedNames.forEach(System.out::println);
        //OR
        sortedNames.forEach(s-> System.out.println("      "+s));

    }
}
