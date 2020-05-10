package Practice_1;

import java.util.Scanner;

public class Task_5 {
    private static String operation(double N, double a, double b){
       if(a-b==N) return "Вычитание";
       else if (a+b==N) return "Сложение";
       else if(a*b==N) return "Умножение";
       else if(a/b==N) return "Деление";
       else return "None";
    }
    public static void main(String[] args){
        double N, a, b;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите N");
        N = s.nextDouble();
        System.out.println("Введите a");
        a = s.nextDouble();
        System.out.println("Введите b");
        b=s.nextDouble();
        System.out.println("Резльтат: "+ operation(N,a,b));
    }
}
