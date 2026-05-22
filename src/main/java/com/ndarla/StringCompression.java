package com.ndarla;

import java.util.Deque;
import java.util.Queue;

public class StringCompression {
    public int compress(char[] chars) {
        int i = 0, j = 1;
        char current = chars[0];
        int charCount = 1;
        while (j < chars.length) {
            System.out.println("char : " + chars[j]);
            System.out.println(" i - Before : " + i);
            //System.out.println("chars : " + i);
            if (current == chars[j]) {
                charCount++;
                System.out.println("charCount : " + charCount);
//                i++;
            } else {
                chars[i] = current;
                i++;
                current = chars[j];
                if (charCount > 1) {
                    chars[i] = (char) (charCount + '0');
                    i++;
                }
                charCount = 1;
            }
            System.out.println(" i - After : " + i);
            System.out.println(chars);
            j++;
        }
        chars[i] = current;
        i++;
        if (charCount > 1) {
            chars[i] = (char) (charCount + '0');
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        StringCompression compression = new StringCompression();
        char[] chars = new char[] {'a','a','b','b','c','c','c'};
        int retVal = compression.compress(chars);
        System.out.println("return value : " + retVal);
        System.out.println(String.valueOf(chars, 0, retVal));
    }
}
