package Practice_6;

import java.util.Scanner;

public class Task_7 {
    static String longestNonrepeatingSubstring(String word) {
        String firstW = "";
        String lastW = "";
        for (int i = 0; i < word.length(); i++) {
            if (!firstW.contains(String.valueOf(word.charAt(i)))) {
                firstW += word.charAt(i);
                if (firstW.length() > lastW.length()) lastW = firstW;
            } else {
                word = word.substring(1);
                firstW = "";
                i = -1;
            }
        }
        return lastW;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        longestNonrepeatingSubstring(a);
    }
}
