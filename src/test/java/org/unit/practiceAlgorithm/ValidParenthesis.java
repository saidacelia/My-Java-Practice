package org.unit.practiceAlgorithm;

import org.testng.annotations.Test;

public class ValidParenthesis {

    @Test(groups = "Unit")
    public void validate() {

        String s = "()";
        boolean result = isValid(s);
        System.out.println(result);
    }

    // use stack
    public static boolean isValid(String s) {

        return false;
    }
}
