package Practice_6;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Task_10 {
    static boolean palindromedescendant(int num) {
        StringBuilder s = new StringBuilder().append(num);
        while (true) {
            if (s.toString().equals(s.reverse().toString())) return true;
            if (s.length() % 2 == 1) break;
            int n = parseInt(s.toString());
            s.delete(0, s.length());
            while (n > 0) {
                s.append(n % 10 + (n % 100 / 10));
                n = n / 100;
            }
        }
        return false;
    }

        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int a=s.nextInt();
            palindromedescendant(a);

    }
}
