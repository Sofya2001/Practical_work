package Practice_6;

import java.util.Scanner;

public class Task_8 {
    static String convertToRoman(int n) {
        StringBuilder result = new StringBuilder();
        while (n >= 1000) {
            result.append("M");
            n -= 1000;
        }
        while (n >= 900) {
            result.append("CM");
            n -= 900;
        }
        while (n >= 500) {
            result.append("D");
            n -= 500;
        }
        while (n >= 400) {
            result.append("CD");
            n -= 400;
        }
        while (n >= 100) {
            result.append("C");
            n -= 100;
        }
        while (n >= 90) {
            result.append("XC");
            n -= 90;
        }
        while (n >= 50) {
            result.append("L");
            n -= 50;
        }
        while (n >= 40) {
            result.append("XL");
            n -= 40;
        }
        while (n >= 10) {
            result.append("X");
            n -= 10;
        }
        while (n >= 9) {
            result.append("IX");
            n -= 9;
        }
        while (n >= 5) {
            result.append("V");
            n -= 5;
        }
        while (n >= 1) {
            result.append("I");
            n -= 1;
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        convertToRoman(a);
    }
}
