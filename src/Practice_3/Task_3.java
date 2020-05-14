package Practice_3;

import java.util.Scanner;

public class Task_3 {
    private static boolean checkPerfect(int a) {
        int s = 0;
        for (int i = 1; i < a; i++) { // перебор чисел от 1 до входного числа
            if (a % i == 0) { /*проверка условия, если остаток входного числа,деленного на i равна, то вычисляется сумма*/
                s = s + i;
            }
        }
        if (s == a) return true;
        else return false;
    }
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число: ");
        a = s.nextInt();
        System.out.println(checkPerfect(a));
    }
}
