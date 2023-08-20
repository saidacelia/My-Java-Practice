package org.interview; /*  Created By  Lyes  on 3/21/2021 , at 10:24 PM  */


public class add5toInteger2 {

    static int solution(int N){
        return N;
    }

    static int getNum(int N, int num) {

        if (num == 0) {
            return N * 10;
        }


        int negative = num / Math.abs(num);

        num = Math.abs(num);
        int n = num;

        int MinValue = Math.min(num, num + N);
        int maxVal = MinValue;
        int counter = 0;
        int position = 1;

        while (n > 0) {
            counter++;
            n = n / 10;
        }

        for (int i = 0; i <= counter; i++) {
            int newVal = ((num / position) * (position * 10)) + (N * position) + (num % position);


            if (newVal * negative > maxVal) {
                maxVal = newVal * negative;
            }


           // int c= countNum(num)*10;
            position = position * 10;
        }

        return maxVal;
    }

    public static int numberOfNums(int num){
      String a= String.valueOf(num);
      a.toCharArray();
      return a.length();
    }
    static int countNum(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }




    public static void main(String[] args) {
        int N = 5;
        int number = 4321;
        int maxValue = getNum(N, number);

        System.out.println("Maximum possible number for " + number + " after inserting " + N + " is: " + maxValue);
        System.out.println(countNum(number));
        System.out.println(numberOfNums(number));
    }
}
