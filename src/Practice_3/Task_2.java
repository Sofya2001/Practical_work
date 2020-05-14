package Practice_3;

import java.util.Scanner;

public class Task_2 {
    private static int findZip(String str) {
        int ind = -1;
        int k = 0;
        for (int i = 0; i < str.length() - 2; i++) { // цикл , с помощью которого перебираем символыы в строке
            char ch = str.charAt(i);
            char ch1 = str.charAt(i + 1);
            char ch2 = str.charAt(i + 2);
            if (ch == 'z' && ch1 == 'i' && ch2 == 'p') { // проверка условия, равна ли значения i-ого символа, i+1,i+2 ,'z','i','p' соответственно
                k++; // счетчтк
                if (k == 2) ind=i; // вывод текущего индекса, если счетчик равен 2
            }
        }
        return ind;
    }

    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите строку");
        str = s.nextLine();
        System.out.println(" Позиция второго вхождения: " + findZip(str));
    }
}
