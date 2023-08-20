package org.unit.practiceJava; /*  Created By  Lyes  on 3/10/2021 , at 9:02 PM  */

import org.testng.annotations.Test;

public class klass {

    @Test(groups = "Unit")
    public void jjj() {
        String name = "lyes hi";
        System.out.println(name.length());
        String abc = "hello world i am here";


        String code="https://www.facebook.com/login.php&code=skip_api_login1&api_key=159693524730858&kid_directed";
        String splt1= code.split("www.")[1];
        String code1= splt1.split("/login")[0];
        System.out.println(code1);


        String[] array = abc.split(" ");

        System.out.println(array.length);   //5

        int count = 0;

        for (int i = 0; i < array.length; i++) {

            count = count + array[i].length();

        }

        System.out.println(count);

    }
}
