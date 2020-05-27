package Practice_4;

import java.util.Scanner;

public class Task_10 {
    static int k=0;
    static int n0=0,n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9 = 0,n10=0,n11=0,n12=0,n13=0,n14=0,n15=0,n16=0,n17=0,n18=0,n19 = 0,n21=0,n22=0,n23=0,n24=0,n25=0,n26=0;
    private static int countUniqueBooks(String str,String str1){
        int n=0;
        int rez=0;
        String str2="";
        String s="";
        int in1=0;
        int in2=0;
        for (int i=0;i<str.length();i++){//цикл перебора всех символов в строке
            if(str.charAt(i)==str1.charAt(0)){
                n++;
                if(n==1) in1=i; // переменная со сзнчанием индекса с 1 входным символом(началом)
                if(n==2){ in2=i;break; // переменная со сзнчанием индекса с 2 входным символом, если находится то выходим из цикла(концом)
            }
        }
    }

for(int i=in1+1;i<in2;i++){ //цикл, в котором считаются количество уникалных символов между двумя индексами входного символа
    switch (str.charAt(i)){
        case 'q' :{ if (n0==0) { n0++; k++;} break;}
        case 'w' : {if (n1==0) { n1++; k++;} break;}
        case 'e': {if (n2==0) { n2++; k++;} break;}
        case 'r':{ if (n3==0) { n3++; k++;} break;}
        case 't' : {if (n4==0) { n4++; k++;} break;}
        case 'y' : {if (n5==0) { n5++; k++;} break;}
        case 'u': {if (n6==0) { n6++; k++;} break;}
        case 'i' : {if (n7==0) { n7++; k++;} break;}
        case 'o': {if (n8==0) { n8++; k++;} break;}
        case 'p' : {if (n9==0) { n9++; k++;} break;}
        case 'a' :{ if (n10==0) { n10++; k++;} break;}
        case 's' : {if (n11==0) { n11++; k++;} break;}
        case 'd': {if (n12==0) { n12++; k++;} break;}
        case 'f':{ if (n13==0) { n13++; k++;} break;}
        case 'g' : {if (n14==0) { n14++; k++;} break;}
        case 'h' : {if (n15==0) { n15++; k++;} break;}
        case 'j': {if (n16==0) { n16++; k++;} break;}
        case 'k' : {if (n17==0) { n17++; k++;} break;}
        case 'l': {if (n18==0) { n18++; k++;} break;}
        case 'z' : {if (n19==0) { n19++; k++;} break;}
        case 'x' : {if (n21==0) { n11++; k++;} break;}
        case 'c': {if (n22==0) { n12++; k++;} break;}
        case 'v':{ if (n23==0) { n13++; k++;} break;}
        case 'b' : {if (n24==0) { n14++; k++;} break;}
        case 'n' : {if (n25==0) { n15++; k++;} break;}
        case 'm': {if (n26==0) { n16++; k++;} break;}
    }

}
for(int i=in2+1;i<str.length();i++){ //формирование из старой строки новую строку без учета предыдущих границ
    str2=str2+str.charAt(i);
}if(str2.length()>2) countUniqueBooks(str2,str1);//рекурсия
    return k;
}


    public static void main(String[] args) {
        String str;
        String str1;
        Scanner s = new Scanner(System.in);
        str=s.nextLine();
        str1=s.nextLine();
        System.out.println(countUniqueBooks(str,str1));
    }
}
