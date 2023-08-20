package org.interview; /*  Created By  Lyes  on 3/21/2021 , at 10:24 PM  */


public class add5toInteger3 {


    static int solution(int N) {
        int newCount;
        int numberFinal;
        int numberToAdd = 5;
        if (N == 0) {
            return numberToAdd * 10;
        }
        if (N > 0) {
            int count = (int) Math.pow(10, numOfChars(N));
            newCount = count * 5;
            numberFinal = newCount + N;
            return numberFinal;

        } else {

            int DeceCount = (int) Math.pow(10, numOfChars(N)-1);
            newCount = DeceCount * 5;
            numberFinal = Math.abs(newCount) + Math.abs(N);
            return numberFinal* -1;
        }
    }


    public static int numOfChars(int num) {
        String a = String.valueOf(num);
        return a.length();
    }


    public static void main(String[] args) {
        int numberInserted=5;
        int N = -52;

        System.out.println("Maximum number for " + N + " after inserting " + numberInserted + " is: " + solution(N));

    }
}
