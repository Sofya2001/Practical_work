package Practice_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_6 {
    static int ulam(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        for (int i = 3; list.size() < num; i++) {
            int count = 0;
            for (int m = 0; m < list.size() - 1; m++) {
                for (int s = m + 1; s < list.size(); s++)
                    if (list.get(m) + list.get(s) == i) count++;
                if (count > 1) break;
            }
            if (count == 1) list.add(i);
        }
        return list.get(num - 1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        ulam(a);
    }
}
