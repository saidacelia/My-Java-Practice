package org.unit.practiceJava; /*  Created By  Lyes  on 3/10/2021 , at 7:27 PM  */

import org.testng.annotations.Test;

public class child extends parent {

public child(){
    super();
}

    public void addition(int a, int b){
        int i=a+b;
        System.out.println(i);
        System.out.println("addition overriding");
    }

    public void addition(double a, double b){
        double i=a+b;
        System.out.println(i);
        System.out.println("double oveerriding");
    }

    @Test(groups = "Unit")
    public void override(){
        child p1= new child();
        p1.addition(3,5);
        p1.addition(2.5, 3.3);

        p1.h=9;
        System.out.println(p1.h);

        parent p= new parent();
        p.addition(2,3);
        parent.st();

        child p2= new child();
        p2.h=2;
        System.out.println(p2.h);
        System.out.println(p1.h);
        p2.h=5;
        System.out.println(p2.h);
        

    }



}
