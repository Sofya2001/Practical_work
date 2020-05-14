package Practice_3;

import java.util.Scanner;

public class Task_6 {
    private static void same(int[] a, int[] b){
        int n0=0,n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9 = 0;
        int q0=0,q1=0,q2=0,q3=0,q4=0,q5=0,q6=0,q7=0,q8=0,q9 = 0;
        boolean z=false;
        int k=0;
        int s=0;
        for (int x: a){ // перебор значений в массиве
            switch (x){ // соответствие x одному из следующих вариантов
                case 0 :{ if (n0==0) { n0++; k++;} break;}
                case 1 : {if (n1==0) { n1++; k++;} break;}
                case 2 : {if (n2==0) { n2++; k++;} break;}
                case 3 :{ if (n3==0) { n3++; k++;} break;}
                case 4 : {if (n4==0) { n4++; k++;} break;}
                case 5 : {if (n5==0) { n5++; k++;} break;}
                case 6 : {if (n6==0) { n6++; k++;} break;}
                case 7 : {if (n7==0) { n7++; k++;} break;}
                case 8 : {if (n8==0) { n8++; k++;} break;}
                case 9 : {if (n9==0) { n9++; k++;} break;}

              }
            }
            for (int y: b){
                switch (y){
                    case 0 : {if (q0==0) { q0++; s++;} break;}
                    case 1 : {if (q1==0) { q1++; s++;} break;}
                    case 2 : {if (q2==0) { q2++; s++;} break;}
                    case 3 : {if (q3==0) { q3++; s++;} break;}
                    case 4 : {if (q4==0) { q4++; s++;} break;}
                    case 5 : {if (q5==0) { q5++; s++;} break;}
                    case 6 : {if (q6==0) { q6++; s++;} break;}
                    case 7 : {if (q7==0) { q7++; s++;} break;}
                    case 8 : {if (q8==0) { q8++; s++;} break;}
                    case 9 : {if (q9==0) { q9++; s++;} break;}
                }
        }
        if (s==k) System.out.println("true");
        else System.out.println("false");
    }
    public static void main(String[] args) {
        int[] a={1, 3, 4, 4, 4};
        int[] b={2, 5, 7};
        same(a,b);
    }
}
