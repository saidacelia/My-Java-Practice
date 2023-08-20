package org.interview; /*  Created By  Lyes  on 3/21/2021 , at 10:24 PM  */


public class add5toInteger {


    static int solution(int num, int N)
    {
        if (num == 0)
        {
            return N * 10;
        }

        int negative = num / Math.abs(num);

        num = Math.abs(num);
        int n = num;

        int MinValue= Math.min(num, num+N);
        int maxVal = MinValue;
        int counter = 0;
        int position = 1;

        while (n > 0)
        {
            counter++;
            n = n / 10;
        }

        for (int i = 0; i <= counter; i++)
        {
            int newVal = ((num / position) * (position * 10)) + (N * position) + (num % position);

            if (newVal * negative > maxVal)
            {
                maxVal = newVal * negative;
            }

            position = position * 10;
        }

        return maxVal;
    }



    public static void main(String[] args)
    {
        int N=5;
        int number=1234;
        int maxValue= solution(number, N);

        System.out.println("Maximum possible number for "+ number+ " after inserting "+N+" is: " + maxValue);
    }
}
