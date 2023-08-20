package org.unit.practiceJava; /*  Created By  Lyes  on 3/10/2021 , at 8:19 PM  */

public class encapsulation {
    // default,  public, private, protected
    private int a= 10;

    private void read(){
        System.out.println("read parent");
    }

    protected void ab(){
        System.out.println("protected");
    }

    public int getJ() {
        return j;
    }

    protected int j= 15;


    public int getAa() {
        return aa;
    }

    int aa= 23;

    //@Test
    public void ggg(){
        encapsulation enc= new encapsulation();
        enc.read();
        System.out.println(enc.a);
    }

}
