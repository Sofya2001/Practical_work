package Practice_3;

import java.util.Scanner;

public class Task_4 {
    private static String flipEndChars(String str){
       String str1= "";
        if(str.length()<2) return "Несовместимо";// проверка длины строки
        else if (str.charAt(0)==str.charAt(str.length()-1)) return "два-это пара"; // проверка равен ли 1 символ последнему символу в строке
        else
            str1=str1 + str.charAt(str.length()-1);  // к новой строке на первую позицию добавляем последний символ входной строке
            for(int i=1;i<str.length()-1;i++){
            str1=str1+str.charAt(i); // на i позицию в новой строке доббавляется i символ входной строки
        }
            str1=str1+str.charAt(0); // после цикла к новой строки добавляется 1 символ входной строки
            return str1; // вывод строки
    }
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите строку");
        str = s.nextLine();
        System.out.println(flipEndChars(str));
    }
}
