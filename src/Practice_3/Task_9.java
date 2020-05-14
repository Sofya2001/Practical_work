package Practice_3;

import java.util.Scanner;

public class Task_9 {
   static int nextPrime(int a){
       int ch=0;
        if(inPrime(a)==true) ch= a;
        else for (int i=a;i<Math.pow(10,8);i++){
            if(inPrime(i)==true) {ch= i;break;}
        }
return ch;
    }
    static boolean inPrime(int n) { // создание метода, который возвращает true, если число простое
        boolean p=false;
        int i;
        if (n >= 10) {
            for (i = 2; i <= 9; i++) {
                if (n % i == 0)
                    return false;
            }
            p= true;
        }
        if (n < 10) {
            int k=0;
            for (i = 2; i <= 9; i++){
                if(n%i==0){
                    k++;
                }
            }
            if (k==1) p= true;
            else p= false;
        }
        return p;
    }
    public static void main(String[] args) {
        int str;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        str = s.nextInt();
        System.out.println(nextPrime(str));
    }
}
