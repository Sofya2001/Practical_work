package Practice_2;

import java.util.Scanner;

public class Task_7 {
    private static boolean isValid(String str) {
        boolean res=true;
     if(str.length()==5){ // проверка длины строки
         for (int i=0;i<str.length();i++){
             char ch=str.charAt(i); // получаем i элемент строки
             if(ch=='0' || ch=='1' || ch=='2' || ch=='3' || ch=='4' || ch=='5' || ch=='6' || ch=='7' || ch=='8' || ch=='9'); // проверка состоит ли строка из чисел посредством проверки каждого символа
             else res=false;
         }
     }
     else res=false;
     return res;
    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Введите индекс");
        String str=s.nextLine();
        System.out.println("Результат: " + isValid(str));

    }

}
