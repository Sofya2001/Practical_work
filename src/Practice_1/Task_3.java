package Practice_1;

import java.util.Scanner;

public class Task_3 {


    public static void main(String[] args) {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество цыплят");
        a = s.nextInt();
        System.out.println("Введите количество коров");
        b = s.nextInt();
        System.out.println("Остаток количество свиней");
        c=s.nextInt();
        System.out.println("Общее количество ног: "+ animals(a,b,c)); // вывод результата
    }
    private static int animals(int a,int b, int c){
       return  (a*2) + (b*4)+(c*4); // вычисление ног у животных
    }
}
