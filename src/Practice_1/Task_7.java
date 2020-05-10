package Practice_1;

import java.util.Scanner;

public class Task_7 {
    private static int addupto(int a){
        int s=0;
        for(int i=0;i<=a; i++){  // цикл с перебором значений от 0 до а
            s=s+i; // вычисление суммы на каждой итерации
        }
        return s;
    }
    public static void main(String[] args){
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число a");
        a = s.nextInt();
        System.out.println("Результат: " + addupto(a));
    }
}
