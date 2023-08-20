package org.unit.practiceJava; /*  Created By  Lyes  on 3/31/2021 , at 2:29 PM  */

import org.testng.annotations.Test;

public class ReverseString {

    public static void reverse(String string) {

        byte[] strByte = string.getBytes();
        byte[] result = new byte[strByte.length];

        for (int i = 0; i < strByte.length; i++) {
            result[i] = strByte[strByte.length - i - 1];

        }
        System.out.println(new String(result));
    }

    public static void reverseString(String st) {
        StringBuilder builder = new StringBuilder(st);
        System.out.println(builder.reverse());
    }

    public static void revString(String string) {
        String position = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            position += string.charAt(i);
        }
        System.out.println(position);
    }


    @Test
    public void test() {

        reverse("abcd");

        reverseString("poul");

        revString("milk");
    }
}
