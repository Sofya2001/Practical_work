package Practice_3;

import java.util.Scanner;

public class Task_5 {
    private static boolean isValidHexCode(String str) {
        boolean res=false;
        if(str.length()==7 && str.charAt(0)=='#'){ // проверка длины строки
            for (int i=0;i<str.length();i++){
                char ch=str.charAt(i); // получаем i элемент строки
                if(ch=='0' || ch=='1' || ch=='2' || ch=='3' || ch=='4' || ch=='5' || ch=='6' || ch=='7' || ch=='8' || ch=='9'|| ch=='A'||ch=='B'||ch=='C'||ch=='D'||ch=='F' ||ch=='E') res = true; // проверка состоит ли строка из чисел посредством проверки каждого символа
                else res=false;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Введите  строку");
        String str=s.nextLine();
        System.out.println(isValidHexCode(str));
    }

}
