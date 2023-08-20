package org.example; /*  Created By  Lyes  on 1/13/2021 , at 12:14 PM  */

import java.util.ArrayList;

public class ReverseString {

    public static void main(String[] args) {

        String a= "Kabylie";
        StringBuilder str= new StringBuilder();
        str.append(a);
        str= str.reverse();
        System.out.println(str);

        //Ternary operator
        int l=1;
        String result = (l<10)?"L is small" : "L is big" ;
        System.out.println(result);


        int [][] nums= {{1,2,3}, {4,5,6}};
        for (int i=0; i<nums.length;i++){
            for (int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println(" ");
        }




    ArrayList<String>names= new ArrayList<String>();
    names.add("micha");
    names.add("agharda");
    names.add("amchich");

        System.out.println(names+" ");


// to reverse a string we can also use this method
        String abc= "agharda";
        String t="";

        for (int i=abc.length()-1; i>=0;i--){
            t=t+abc.charAt(i);

        }
        System.out.println(t);








}
}
