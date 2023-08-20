package org.unit.practiceAlgorithm;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {

    @Test(groups = "Unit")
    public void perm() {
        String str = "ABC";  // ABC ACB BAC BCA CAB CBA
        findStringPermutations(str);
    }

    // NOT SOLVED : need to change logic
    public static void findStringPermutations(String word) {
        String subString = "";
        String result = "";
        int wordLength = word.length();
        List<String> substringList = new ArrayList<>();

        for (int i = 0; i < wordLength; i++) {
            for (int j = i; j < wordLength; j++) {
                subString += word.charAt(j);
                if (subString.length() == wordLength) {
                    result = subString;
                    substringList.add(result);
                    continue;
                }
            }
            subString = "";       // set substring to blank value before next iteration
        }
        System.out.println("List of substring permutations found from the given string => " + substringList);
    }

}
