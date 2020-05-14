package Practice_3;

import java.util.Scanner;

public class Task_7 {
    private static boolean isKaprekar(int a) {
        boolean s = false;
        int k = 1;
        int kv = a * a; // вычисление квадратного корня

        while (kv / 10 != 0) { //  в данном цикле вычисляется количество цифр во входном числе
            kv = kv / 10;
            k++;
        }
        if (k == 1) {
            if (0 + (a * a) == a) s = true;
            else s = false;
        }
        if (k % 2 == 0) {
            int raz = k / 2;
            double a1 = (a * a) / (Math.pow(10, raz)); // вычисление левого числа
            int a6=(int) a1; //  перевод из типа double(a1) в тип int
            double a2 = (a * a) % (Math.pow(10, raz));// вычисления правого числа
            if (a6 + a2==a) s = true; // проверка равна ли сумма двух новых чисел входному числу
            else s = false;
        }
        if (k % 2 != 0) {
            int raz = k / 2;
            double a3 = (a * a) / (Math.pow(10, k - raz));
            int  a5= (int) a3;
            double a4 = (a * a) % (Math.pow(10, k - raz));
            if (a4 +a5==a) s = true;
            else s = false;
        }
        return s;
    }

    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число: ");
        a = s.nextInt();
        System.out.println("Результат: " + isKaprekar(a));
    }
}
