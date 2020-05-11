package Practice_2;

import java.util.Scanner;

public class Task_9 {
    private static boolean isPrefix(String str, String str1) {
        boolean res = true;
        int pr = str1.length() - 1; // возврат длинны строки без "-"
        for (int i = 0; i < pr - 1; i++) {
            if (str.charAt(i) == str1.charAt(i)) ;// проверка символов на равенство
            else res = false;
        }
        return res;
    }

    private static boolean isSuffix(String str, String str1) {
        boolean res = true;
        int pr = str1.length() - 1; // возврат длинны строки без "-"
        for (int i = 1; i <=pr; i++) {
            if (str.charAt(str.length()-i) == str1.charAt(str1.length()-i)) ; // проверка символов на равенство
            else res = false;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String str = s.nextLine();
        System.out.println("Введите 2 строку");
        String str1 = s.nextLine();
        System.out.println("Префикс: " + isPrefix(str,str1) );
        System.out.println("Суффикс: " + isSuffix(str,str1) );

    }
}
