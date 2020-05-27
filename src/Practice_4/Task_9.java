package Practice_4;

import java.util.Scanner;

public class Task_9 {
private static boolean trouble(int a,int b){
    int n=0;
    int p=0;
    String str=String.valueOf(a); // конвертация из числа в строку
    String str1=String.valueOf(b);
    int k0=0,k1=0,k2=0,k3=0,k4=0,k5=0,k6=0,k7=0,k8=0,k9=0;
    int s0=0,s1=0,s2=0,s3=0,s4=0,s5=0,s6=0,s7=0,s8=0,s9=0;
    for(int i=0;i<str.length();i++){
            switch (str.charAt(i)){ // соответствие i 1 строки одному из следующих вариантов
                case '0' :  k0++; if(k0==3) n=0;break;
                case '1' :  k1++; if(k1==3) n=1;break;
                case '2' :   k2++; if(k2==3) n=2;break;
                case '3' :  k3++; if(k3==3) n=3;break;
                case '4' :  k4++; if(k4==3) n=4;break;
                case '5' :   k5++; if(k5==3) n=5;break;
                case '6' :    k6++; if(k6==3) n=6;break;
                 case '7' : k7++; if(k7==3) n=7;break;
                case '8' :   k8++; if(k8==3) n=8;break;
                case '9' :   k9++; if(k9==3) n=9;break;
                }
                }
        for(int i=0;i<str1.length();i++){
        switch (str1.charAt(i)){ // соответствие i 2 строки одному из следующих вариантов
            case '0' : { s0++; if(s0==2) p=0;break;}
            case '1' : { s1++; if(s1==2) p=1;break;}
            case '2' :  { s2++; if(s2==2) p=2;break;}
            case '3' : { s3++; if(s3==2) p=3;break;}
            case '4' : { s4++; if(s4==2) p=4;break;}
            case '5' :  { s5++; if(s5==2) p=5;break;}
            case '6' :   { s6++; if(s6==2) p=6;break;}
            case '7' :{ s7++; if(s7==2) p=7;break;}
            case '8' :  { s8++; if(s8==2) p=8;break;}
            case '9' :  { s9++; if(s9==2) p=9;break;}
        }

            }
    if(p==n) return true;
    else return false;
}

    public static void main(String[] args) {
        int a;
        int b;
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
       System.out.println(trouble(a,b));
    }
}
