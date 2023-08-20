package org.unit.practiceJava; /*  Created By  Lyes  on 3/10/2021 , at 7:21 PM  */

import org.testng.annotations.Test;

public class parent {

    public parent(){
        System.out.println("constructor 1");
    }

    public parent(double m){
        System.out.println("constructor 2   " + m);
    }

    public parent(int x){
        System.out.println("constructor 3"+ x);
    }




    int h= 5;      //instance
    static int w= 8;    // static variable

    public void addition(int a, int b){
        int i=a+b;          // local variable
        System.out.println(i);
    }


    public void addition(double a, double b){
        double i=a+b;
        System.out.println(i);
    }

    public static void st(){
        System.out.println("static method");
        System.out.println(w);
    }

    @Test(groups = "Unit")
    public void add(){
        int f=1;
        int g=2;
        double k=255;
        double l=2.666;


        //parent p= new parent();
//        p.addition(f,g);
//        p.addition(k,l);

        parent parent1= new parent(2);
//        parent parent2= new parent(3);

//        System.out.println(parent1);
//        System.out.println(parent2);


    }

}
