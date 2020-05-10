package Practice_1;

import java.util.Scanner;

public class Task_4 {
    private static boolean profitableGamble(double prob, double prize,double pay){
        if (prob+prize>pay) return true; // проверка условия
        else return false;
    }
    public static void main(String[] args){
        double prob, prize, pay;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите prob");
        prob = s.nextDouble();
        System.out.println("Введите prize");
        prize = s.nextDouble();
        System.out.println("Остаток pay");
        pay=s.nextDouble();
        System.out.println("Резльтат: "+ profitableGamble(prob,prize,pay));
    }
}
