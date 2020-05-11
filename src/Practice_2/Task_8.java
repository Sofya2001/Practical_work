package Practice_2;

import java.util.Scanner;

public class Task_8 {
    private static boolean isStrangePair(String str, String str1) {
        boolean res = false;
        if (str.charAt(0) == str1.charAt(str1.length() - 1) && str.charAt(str.length() - 1) == str1.charAt(0)) // проверка условия равенства символов
            res = true;
        return res;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String str = s.nextLine();
        System.out.println("Введите вторую строку");
        String str1 = s.nextLine();
        System.out.println("Результат: " + isStrangePair(str, str1));

    }
}
