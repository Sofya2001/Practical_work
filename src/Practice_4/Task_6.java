package Practice_4;

import java.util.Scanner;

public class Task_6 {
    static int n=0;
private  static int bugger(int a) {
    int p = 1;
    int c = a;
    int k = 0;
    while (a >= 1) { // цикл для подсчета цифр в числе
        k++;
        a /= 10;
    }
    for (int i = 0; i < k; i++) {// цикл для вычисления произведения цифр в числе
        int o = c % 10;
        p = p * o;
        c /= 10;
    }
    if (p >= 10) {
        n ++;
        bugger(p); // рекурсия
    }
    else return n+1; //возврат значения с учетом , что n=0 первоначально
 return n+1;
}
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        System.out.printf("Результат: %d ",bugger(a));

    }
}
