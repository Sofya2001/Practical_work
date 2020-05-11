package Practice_2;

import java.util.Scanner;

public class Task_6 {
    private static int Fibonacci(int a) {
        if (a==0 || a==1) return 1; // возврат 1 , если a=0 или a=1
        int res;
        res= Fibonacci(a-1) + Fibonacci(a-2); // рекурсия
        return res;
        }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Введите число");
        int a=s.nextInt();
        System.out.println("Результат: " + Fibonacci(a));

    }

}