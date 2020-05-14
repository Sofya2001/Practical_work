package Practice_3;

import java.util.Scanner;

public class Task_10 {
    private static boolean rightTriangle(double a,double b,double c){
        if(a>b && a>c) { if (b*b+c*c==a*a) return true;
        else return  false;}
        if(c>b && c>a) { if (b*b+a*a==c*c) return true; else return false; }
        if (b>c && b>a){ if (c*c+a*a==b*b) return true; else return false;}
        return false;
    }
    public static void main(String[] args) {
        double a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите 1 ребро");
        a = s.nextDouble();
        System.out.println("Введите 2 ребро");
        b = s.nextDouble();
        System.out.println("Введите 3 ребро");
        c = s.nextDouble();
        System.out.println("Резултат: " + rightTriangle(a,b,c));
    }
}
