package Practice_2;

import java.util.Scanner;

public class Task_1 {
    private static String repeat(String str, int a){ // создание метода repeat
        String s=""; // инициализация пустой строки
        for(int i=0;i<str.length();i++){ //  цикл от 0 до размера входной строки
            char ch=str.charAt(i); // значение i символа
            for (int j=0;j<a;j++){ // цикл от 0 до входного значения а, с помощью него i символ повторяется а раз
               s=s+ch; // добавление символа в строку
            }
        }
    return s;
    }
    public static void main(String[] args){
        String str;
        int a;
        Scanner s=new Scanner(System.in);
        System.out.println("Введите строку");
        str=s.nextLine();
        System.out.println("Введите число повторений");
        a=s.nextInt();
        System.out.println("Результат: " + repeat(str,a));
    }
}
