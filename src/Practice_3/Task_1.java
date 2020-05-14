package Practice_3;

import java.util.Scanner;

public class Task_1 {
    private static void solutions(double a, double b, double c){
        double d=b*b-(4*a*c); // вычисление дискриминанта
       if(d>0){ // проверка условия , больше ли дискриминант 0
          double x1 = ((-b)-(Math.sqrt(d)))/2*a; //  нахождение 1 корня
          double x2 = ((-b)+(Math.sqrt(d)))/2*a; // нахождение 2 корня
           System.out.printf("Уравнение имеет 2 корня: x1 = %f ; x2 = %f %n ", x1,x2 );
       }
       if(d==0){ // проверка условия
           double x=-b/(2*a); //нахождение корня
           System.out.printf("Уравнение имеет 1 корень: x = %f %n ", x );
       }
       if(d<0) System.out.println(" Корней нет"); // проверка условия, если дискрименант меньше нуля, то вывод "корней нет"
    }
    public static void main(String[] args){
        double a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число a");
        a = s.nextDouble();
        System.out.println("Введите число b");
        b = s.nextDouble();
        System.out.println("Введите число c");
        c = s.nextDouble();
        solutions(a,b,c);
    }
}
