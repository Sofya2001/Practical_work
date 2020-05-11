package Practice_2;

import java.util.Scanner;

public class Task_10 {
    private static int boxSeq(int a) {
        if(a==0) return 0; // нулевой шаг
        if (a % 2 == 0) return a; // если число четное, то возвращается изначальное число
        else return boxSeq(a - 1) + 3; //  если число не четное, то возвращается изначальное число, прибавленное на три

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите шаг: ");
        int a = s.nextInt();
        System.out.println("Результат: " + boxSeq(a));
    }

}