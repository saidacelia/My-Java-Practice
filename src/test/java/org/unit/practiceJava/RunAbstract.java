package org.unit.practiceJava; /*  Created By  Lyes  on 3/10/2021 , at 7:12 PM  */

import org.testng.annotations.Test;

public class RunAbstract extends Abstraction implements interfaceExample{

    @Override
    void write() {
        System.out.println("write");
    }

    @Override
    void delete() {
        System.out.println("delete");
    }

    @Override
    public void clear() {
        System.out.println("clear");
    }

    @Override
    public void hello() {
        System.out.println("hello");
    }

    @Override
    public void hi() {
        System.out.println("hi");
    }

    @Test(groups = "Unit")
    public void run(){
        RunAbstract runAbstract= new RunAbstract();
        runAbstract.read();
        runAbstract.clear();
    }


}
