package Practice_4;

import java.util.Scanner;

public class Task_2 {
    private static void split(String str) {
        String str1 = "";
        int k=0;
        int s=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) !='(') { // подсчет количества символа "("
                k++;
                str1=str1+str.charAt(i);
            }
            else { s++;// подсчет количества символа ")"
            str1=str1+str.charAt(i);
            }
            if(s==k) {// проверка равенства количества "(" и ")"
                System.out.printf("'%s', ",str1);
                s=0;
                k=0;
                str1="";
            }

            }

            }

    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        str = s.nextLine();
        split(str);
    }
}
