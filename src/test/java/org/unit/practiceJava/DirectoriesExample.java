package org.unit.practiceJava; /*  Created By  Lyes  on 3/25/2021 , at 10:30 PM  */

import org.testng.annotations.Test;

import java.io.File;

public class DirectoriesExample {

    @Test
    public void directoryCount(){
        String[]content= new File(".").list();
        for(String file:content){
            System.out.println(file);
        }
    }
}
