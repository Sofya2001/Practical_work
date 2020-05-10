package Practice_1;

import java.util.Scanner;

public class Task_10 {
    private static boolean abcmath(double a, double b, double c){
        for (int i=0; i<b;i++){
            a=a*2;
        }
        System.out.println("Число а после после преобразований: " +a);
        if (a%c==0) return true;
        else return false;
    }
    public static void main(String[] args){
        double a;
        double b;
        double c;
        Scanner s= new Scanner(System.in);
        System.out.println("Введите число a");
        a= s.nextDouble();
        System.out.println("Введите число b");
        b=s.nextDouble();
        System.out.println("Введите число c");
        c=s.nextDouble();
        System.out.println("Результат: " + abcmath(a,b,c) );
    }
}
