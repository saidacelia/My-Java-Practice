package org.unit.practiceJava; /*  Created By  Lyes  on 3/10/2021 , at 7:08 PM  */

abstract class Abstraction {

    public void read() {
        System.out.println("I can read");
    }

    abstract void write();

    abstract void delete();

    public void paint(){
        System.out.println("i can paint");
    }

}
