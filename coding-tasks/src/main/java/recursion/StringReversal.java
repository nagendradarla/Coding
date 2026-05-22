package recursion;

import java.util.Arrays;

public class StringReversal {
    private String[] stringArray = null;
    public String reverse(String str) {
        if (str.length() <= 1) return str;
        return str.charAt(str.length() - 1) + reverse(str.substring(0,str.length()-1));
    }

    public String reverse2(String str, int length) {
        //System.out.println(str.split("").length);
        if (stringArray == null || stringArray.length == 0) {
            stringArray = str.split("");
        }
        if (length <= 0) return "";
        return stringArray[length-1] + reverse2(str, length-1);
    }

    public String reverseIteration(String str) {
        if (str.length() == 1) return str;
        String[] stringArray = str.split("");
        String reverse = "";
        for (int i = stringArray.length-1 ; i >= 0 ; i--) {
            reverse += stringArray[i];
        }
        //Arrays.stream(stringArray).sorted();
        return reverse;
    }

    public static void main(String[] args) {
        StringReversal stringReversal = new StringReversal();
        System.out.println(stringReversal.reverse("nagendra"));
        System.out.println(stringReversal.reverse2("nagendra", "nagendra".length()));
        System.out.println(stringReversal.reverseIteration("nagendra"));
    }
}

