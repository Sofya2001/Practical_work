package Practice_1;

import java.util.Scanner;

public class Task_2{
     private  static double triArea(double a, double b){
        double c = 0.5*a*b; // нахождение площади треугольника
        return c;
        }
public static void main(String[] args) {
        double a;
        double b;
        Scanner s= new Scanner(System.in);
        System.out.println("Введите основание");
        a= s.nextDouble();
        System.out.println("Введите высоту");
        b=s.nextDouble();
        System.out.println("Площадь треугольника: " + triArea(a,b) ); // вывод результат с помощью вызова ранее написанного метода
        }
        }
