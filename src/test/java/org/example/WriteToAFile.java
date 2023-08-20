package org.example; /*  Created By  Lyes  on 1/16/2021 , at 1:48 AM  */

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class WriteToAFile {
    public static void main(String[] args) throws IOException {

        FileInputStream fis= new FileInputStream("./MockFile2.txt");
        Properties properties= new Properties();
        properties.load(fis);
        String text1= properties.getProperty("text1");
        String text2= properties.getProperty("text2");
        String text3= properties.getProperty("text3");
        String text4= properties.getProperty("text4");

        //to get the all the text from a text file , we need to convert it into bytes and then convert it to string using new String
        String bigText= new String(Files.readAllBytes(Paths.get("./Mocktest3.txt")));

        FileWriter myWriter = new FileWriter("./MockFile.txt");
        myWriter.write(text1+" ");
        myWriter.write(text2+ " ");
        myWriter.write(text3+" ");
        myWriter.write(text4);
        myWriter.write(bigText);
        System.out.println(bigText);

        myWriter.close();
        System.out.println("Successfully wrote to the file.");


    }
}
