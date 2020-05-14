package Practice_3;

import java.util.Scanner;

public class Task_8 {
    private static String longestZero(String str){
        String str1="";
        String max="";

        for (int i=0; i<str.length();i++){
            if (str.charAt(i)=='0'){ // проверка равен ли i символ '0'
                str1=str1+str.charAt(i); //к новой строке добавляется 0
                if(str1.length()>max.length()) max=str1; // если новая строка больше максимальной, то максималному значению приравневается новая строка
            }
            if (str.charAt(i)=='1') str1=""; // если i значение равно 1, то значение новой строке сбрасывается до пустой строке
        }
        return max;
    }
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите строку");
        str = s.nextLine();
        System.out.println(longestZero(str));
    }
}
