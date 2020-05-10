package Practice_1;

import java.util.Scanner;

public class Task_1 {
    private static double remainder(double a, double b){ //создается метод с параметрами a и b
        double c = a%b; // вычисление остатка от деления
        return c; // возврат результата
    }
    public static void main(String[] args) {
        double a;
        double b;
        Scanner s= new Scanner(System.in);
        System.out.println("Введите 1 число a");
        a= s.nextDouble();
        System.out.println("Введите 2 число b");
        b=s.nextDouble();
        System.out.println("Остаток от деления: " + remainder(a,b) );
    }
}


