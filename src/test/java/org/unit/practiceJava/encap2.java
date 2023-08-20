package org.unit.practiceJava; /*  Created By  Lyes  on 3/10/2021 , at 8:23 PM  */

import org.testng.annotations.Test;

public class encap2 extends encapsulation{


    private void read(){
        System.out.println("read child");
    }




    @Test(groups = "Unit")
    public void hgjh(){
        encapsulation e=new encapsulation();
        encap2 e2= new encap2();
        e2.read();
    }

}
