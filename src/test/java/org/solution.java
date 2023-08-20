package org;

import java.io.*;

public class solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String firstString = bufferedReader.readLine();
        String secondString = bufferedReader.readLine();

        Boolean result = Anagrams.isAnagram(firstString, secondString);

        bufferedWriter.write(String.valueOf(result ? 1 : 0));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();


    }
}
