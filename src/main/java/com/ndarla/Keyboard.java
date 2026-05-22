package com.ndarla;

import java.io.*;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'receivedText' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING S as parameter.
     */

    public static String receivedText(String S) {
        //ArrayList<string> output = new ArrayList<>();
        StringBuffer end = new StringBuffer();
        StringBuffer output = new StringBuffer();
        for (int i=0; i<S.length(); i++) {
            char c = S.charAt(i);
             if (String.valueOf(c).equals("*")) {
                 //System.out.println(S.charAt(i));
                 output = new StringBuffer(output.substring(0, output.length()-1));
             } else if (String.valueOf(c).equals("<")) {
                 //System.out.println(S.charAt(i));
                 end = new StringBuffer(output).append(end);
                 output = new StringBuffer();
             } else if (String.valueOf(c).equals(">")) {
                 //System.out.println(S.charAt(i));
             } else if (String.valueOf(c).equals("#")) {
                 //System.out.println(S.charAt(i));

             }
            System.out.println(S.charAt(i));
        }
        return output.toString();
    }

}

public class Keyboard {
    public static void main(String[] args) throws IOException {
        //2BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //String S = bufferedReader.readLine();

        String S = "HE*<LL>O";

        String result = Result.receivedText(S);

        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        //bufferedReader.close();
        //bufferedWriter.close();
    }
}
