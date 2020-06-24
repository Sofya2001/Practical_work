package Practice_6;

import java.util.Scanner;

public class Task_5 {
    private static void getHashTags(String str) {
        int min = 0;
        int sr = 0;
        String zn = " ";
        String zn1 = " ";
        String zn2 = " ";
        int max = 0;
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                str1 = str1 + str.charAt(i);
            } else {
                if (str1.length() > min && str1.length() > sr && str1.length() > max) {
                    min = sr;
                    sr = max;
                    max = str1.length();
                    zn=str1;
                } else if (str1.length() > min && str1.length() >= sr && str1.length() <= max) {
                    min = sr;
                    sr = str1.length();
                    zn1=str1;
                } else if (str1.length() < max && str1.length() <= sr && str1.length() > min) {
                    min = str1.length();
                    zn2=str1;
                }
                str1 = "";
            }
        }
        System.out.print("#"+zn.toLowerCase()+" "+"#"+zn1.toLowerCase()+" "+ "#"+zn2.toLowerCase());


        }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        getHashTags(str);
    }
}
