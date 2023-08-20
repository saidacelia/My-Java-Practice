package org.unit.practiceAlgorithm;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Lambda {

    @Test(groups = "Unit")
    public void lmb() {
        test();

    }

    public static void test() {
        List<String> names_list = Arrays.asList("Adam,Bobby,Chandler,Down");

        System.out.println("Printing values via lambda expression ->");
        names_list.forEach(name -> System.out.println(name));

        System.out.println("Printing values via method references ->");
        names_list.forEach(System.out::println);


    }

}
