package Practice_4;

import java.util.Scanner;

public class Task_8 {
private static boolean doesRhyme(String a,String b) {
    String str = "";
    String str1 = "";
    String str2 = "";
    String str3 = "";
    int z = 0;
    for (int i = a.length() - 1; i >= 0; i--) { //цикл для формирования последнего слова в 1 строке
        if (a.charAt(i) != ' ') {
            str = str + a.charAt(i);
        } else break;
    }
    for (int i = b.length() - 1; i >= 0; i--) {  //цикл для формирования последнего слова во 2 строке
        if (b.charAt(i) != ' ') {
            str1 = str1 + b.charAt(i);
        } else break;
    }
    if((str=="thyme" && str1=="lime") ||(str=="lime" && str1=="thryme") ||(str=="away" && str1=="today" )||(str=="today" && str1=="away")) return true;// проверка исключений,заданных в условии
   else {
        for (int i = 0; i < str.length(); i++) { //цикл формирования 1 строки из гласных
            if (str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'e' || str.charAt(i) == 'A' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i) == 'E') {
                str2 = str2 + str.charAt(i);
            }
        }
        for (int i = 0; i < str1.length(); i++) {//цикл формирования 2 строки из гласных
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u' || str1.charAt(i) == 'e' || str1.charAt(i) == 'A' || str1.charAt(i) == 'I' || str1.charAt(i) == 'O' || str1.charAt(i) == 'U' || str1.charAt(i) == 'E') {
                str3 = str3 + str.charAt(i);
            }


        }
        if (str2.length() == str3.length()) { // цикл в цикле для проверки являются ли гласные в 1 строке аналогичным гласным во второй строке
            for (int i = 0; i < str2.length(); i++) {
                for (int j = 0; j < str3.length(); j++) {
                    if (str2.charAt(i) == str3.charAt(j)) {
                        z++;
                        break;
                    }
                }

            }

        }
        if (z == str2.length()) return true;
        else return false;
    }
}




    public static void main(String[] args) {
        String str;
        String str1;
        Scanner s = new Scanner(System.in);
       str=s.nextLine();
       str1=s.nextLine();
       System.out.println(doesRhyme(str,str1));
    }
}
