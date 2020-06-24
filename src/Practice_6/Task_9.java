package Practice_6;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Task_9 {
    static boolean formula(String formula) {
        formula += " = " + formula;
        String[] arr = formula.split(" ");
        int n = 0, n1 = 0, i = 0;
        while (i < 7) {
            if (arr[i + 1].equals("+")) n1 = parseInt(arr[i]) + parseInt(arr[i + 2]);
            else if (arr[i + 1].equals("-")) n1 = parseInt(arr[i]) - parseInt(arr[i + 2]);
            else if (arr[i + 1].equals("*")) n1 = parseInt(arr[i]) * parseInt(arr[i + 2]);
            else if (arr[i + 1].equals("/") & !arr[i + 2].equals("0"))
                n1 = parseInt(arr[i]) / parseInt(arr[i + 2]);
            n = n1;
            i += 6;
        }
        return parseInt(arr[4]) == n & parseInt(arr[4]) == n1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        formula(a);
    }

}
