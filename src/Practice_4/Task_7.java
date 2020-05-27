package Practice_4;

import java.util.Scanner;

public class Task_7 {

    private static String stroka(String s, int a){//формирование строки только с повторяющимися значениями
        int n=2;
        String ch="";
        String str="";
        for (int i=a;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)) n++;
            if(s.charAt(i)!=s.charAt(i+1)){
             ch=String.valueOf(n); //конвертация
            str=s.charAt(i)+"*"+ch; break;} //формирование строки и выход из цикла
        }
       return str;
    }
    private static int nomer(String s, int a){//вычисление индекса длля последнего повторяющегося символа
        int n=1;
        for (int i=a;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)) n++;
            else if(n!=2) break;
            else return 1;
    }
        return n;
}



private static void toStarShorthand(String str){ // вывод получившихся строк
        String str2="";
    for (int i=0;i<str.length()-1;i=i+nomer(str,i)){ // i меняется с учетом того, были ли символы повторяющимися, если да,
        // то изменяется на значение раное количеству повторений, если нет , то на 1

       if(str.charAt(i)!=str.charAt(i+1)) {
         System.out.print(str.charAt(i));
       }
        if(str.charAt(i)==str.charAt(i+1)) {

            System.out.print(stroka(str,i+1)); // вызов метода, написанного выше и вывод строки с учетом его возвращаемого значения

          }
    }
    System.out.print(str.charAt(str.length()-1));

}
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        str="77777gef";
toStarShorthand(str);

    }
}
