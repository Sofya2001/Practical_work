package Practice_1;

import java.util.Scanner;

public class Task_8 {
    private  static double nextEdge(int a,int b){
        int c = (a+b)-1; // вычисление третьей стороны
        return c;
    }
    public static void main(String[] args) {
        int a;
        int b;
        Scanner s= new Scanner(System.in);
        System.out.println("Введите 1 сторону");
        a= s.nextInt();
        System.out.println("Введите 2 сторону");
        b=s.nextInt();
        System.out.println("Третья сторона: " + nextEdge(a,b) );
    }
}
