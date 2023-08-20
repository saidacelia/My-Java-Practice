package org.unit.practiceAlgorithm;

import org.testng.annotations.Test;

public class Factoriall {

    @Test(groups = "Unit")
    public void checkFactoriel() {

        computeFact(2);
        int result = computeFactViaRecurssion(5);
        System.out.println(result);
    }


    public static void computeFact(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        //System.out.println(fact);
    }


    public static int computeFactViaRecurssion(int num) {

        if (num == 1) {
            return num;
        } else {
            return num * computeFactViaRecurssion(num - 1);
        }
    }


}
