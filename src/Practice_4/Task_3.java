package Practice_4;

import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class Task_3 {
    static String str1="";
    static String str2="";
    static int k;
    private static String Case(String str){
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)=='_'){ //проверка на наличие _
               return toCamelCase(str); // вывод значения из методв приведенного ниже
            }
            if (str.charAt(i)=='A'||str.charAt(i)=='B'||str.charAt(i)=='C'||str.charAt(i)=='D'||str.charAt(i)=='E'||str.charAt(i)=='F'||str.charAt(i)=='G'||str.charAt(i)=='H'||str.charAt(i)=='I'||str.charAt(i)=='J'||str.charAt(i)=='K'||str.charAt(i)=='L'||str.charAt(i)=='N'||str.charAt(i)=='O'||str.charAt(i)=='P'||str.charAt(i)=='Q'||str.charAt(i)=='R'||str.charAt(i)=='S'||str.charAt(i)=='U'||str.charAt(i)=='T'||str.charAt(i)=='V'||str.charAt(i)=='W'||str.charAt(i)=='X'||str.charAt(i)=='Y'||str.charAt(i)=='Z'){// проверка на наличие болиших букв в строке
            return toSnakeCase(str);}// вывод значения из методв приведенного ниже

            }
        return "Не корректно";

    }
    private static String toSnakeCase(String str) {
        str.toLowerCase(); // символы в строке преобразуется в  маленькие символы
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i)=='A'||str.charAt(i)=='B'||str.charAt(i)=='C'||str.charAt(i)=='D'||str.charAt(i)=='E'||str.charAt(i)=='F'||str.charAt(i)=='G'||str.charAt(i)=='H'||str.charAt(i)=='I'||str.charAt(i)=='J'||str.charAt(i)=='K'||str.charAt(i)=='L'||str.charAt(i)=='N'||str.charAt(i)=='O'||str.charAt(i)=='P'||str.charAt(i)=='Q'||str.charAt(i)=='R'||str.charAt(i)=='S'||str.charAt(i)=='U'||str.charAt(i)=='T'||str.charAt(i)=='V'||str.charAt(i)=='W'||str.charAt(i)=='X'||str.charAt(i)=='Y'||str.charAt(i)=='Z'){str=str.toLowerCase();  k=i;}
            str1=str1+str.charAt(i);

        }
        for (int i=0;i<k;i++) {
            str2=str2+str1.charAt(i);
        }
        str2=str2+'_';
        for (int i=k;i<str1.length();i++) {
            str2=str2+str1.charAt(i);
        }
        return str2;
        }
        private static String toCamelCase(String str) {
        int j=0;
            for (int i=0;i<str.length();i++) {
                if(str.charAt(i)=='_')  j=i;// переменной  j присваевается значения индекса символа"_"
            }
            for (int i=0;i<j;i++) {
                str2=str2+str.charAt(i);
            }
            char w=str.charAt(j+1);
            w=toUpperCase(w);// символ преобразуем в верхний регистр
            str2=str2+w;
            for (int i=j+2;i<str.length();i++) {
                str2=str2+str.charAt(i);
            }

        return str2;}

    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        str = s.nextLine();
        System.out.println(Case(str));
    }
}

