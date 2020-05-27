package Practice_4;

import java.util.Scanner;

public class Task_1 {
    private static void essay( int k, String str) {
        String str1 = "";
        String str2 = "";
        int c = 0;
        for (int i = 0; i <str.length(); i++) {// формирование слов в строке
            if (str.charAt(i) != ' ') {
                str1 = str1 + str.charAt(i);
            }
            if (str.charAt(i) == ' ') {
                if (((str2 + str1).length()) <= k + c) {// проверка длины строки без учета пробелов
                    str2 = str2 + str1 + ' '; //формирование слов в одной строке
                    c++; // используем для подсчета пробелов
                    str1 = "";
                } else {
                    System.out.print(str2);//вывод слов в одну строчку
                    System.out.println();// переход на нижнюю строку
                    // "сбрасывание" предыдущих значений для образованя слов в следующей строке
                    str2 = "" + str1;
                    str2 = str2 + ' ';
                    str1 = "";
                    c=1;
                }
            }
        }
        System.out.println(str2);
    }
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        int b=7;
        str = "hello my name is Bessie and this is my essay ";
        essay(b,str);

    }

}
