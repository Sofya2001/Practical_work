package Practice_2;

import java.util.Scanner;

public class Task_5 {
    private static int getDecimalPlaces(String str){
        int k=0;
        float a=Float.parseFloat(str); // конвертация из типа String  в тип float
        while ((a*10)%10!=0){ /* цикл : пока результирующее число умноженное на 10 имеет остаток , то число умножается на 10*/
            k++; // счетчик
            a*=10;
            }
        return k;
        }

    public static void main(String[] args){
        String str;
        Scanner s=new Scanner(System.in);
        System.out.println("Введите строку c числом");
        str=s.nextLine();
        System.out.println("Результат: " + getDecimalPlaces(str));
    }
}
