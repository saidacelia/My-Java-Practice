package org.unit.practiceAlgorithm;

import org.testng.annotations.Test;

public class Factorial {

    @Test(groups = "Unit")
    public void checkFactorial() {

        int number = 5;

        calculateFactWithoutRecursion(number);
        System.out.println("Factorial via recursion =>" + calculateFactViaRecursion(number));
    }


    public static void calculateFactWithoutRecursion(int number) {
        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println("Factorial of number =>" + fact);
    }

    public static int calculateFactViaRecursion(int number) {
        if (number == 1) {
            return number;
        } else {
            return number * calculateFactViaRecursion(number - 1);
        }
    }


}
