package Practice_4;

import java.util.Scanner;

public class Task_5 {
    private  static void BMI(String a, String b){
        String str1="";
        float d=1;
        float ir=1;
        String str2="";
       for (int i=0;i<a.length();i++){//формирование строки со значением веса
          if(a.charAt(i)=='0' ||a.charAt(i)=='1' ||a.charAt(i)=='2' ||a.charAt(i)=='3' ||a.charAt(i)=='4' ||a.charAt(i)=='5' ||a.charAt(i)=='6' ||a.charAt(i)=='7' ||a.charAt(i)=='8' ||a.charAt(i)=='9'){
             str1=str1+a.charAt(i);
          }
          if (a.charAt(i)=='p') d=(float) 0.454; //если вес в футах, то d-коэффициент
       }
        for (int i=0;i<b.length();i++){
            if(b.charAt(i)=='0' ||b.charAt(i)=='1' ||b.charAt(i)=='2' ||b.charAt(i)=='3' ||b.charAt(i)=='4' ||b.charAt(i)=='5' ||b.charAt(i)=='6' ||b.charAt(i)=='7' ||b.charAt(i)=='8' ||b.charAt(i)=='9'){
                str2=str2+b.charAt(i);
            }
            if (b.charAt(i)=='i')ir= (float) 0.0254;//если рост в дюймах, то ir-коэффициент
        }
        float v=Float.parseFloat(str1);//конвертация
        float l=Float.parseFloat(str2);//конвертация
        float bmi= (v*d)/(l*l*ir*ir);
        if(bmi<18.5) System.out.printf("%f underweigh", bmi);
        if(bmi>=18.5 && bmi<=24.9) System.out.printf("%f normal weigh", bmi);
        if(bmi>24.9) System.out.printf("%f overweigh", bmi);

    }
    public static void main(String[] args) {
        String a;
        String b;
        Scanner s = new Scanner(System.in);
        a=s.nextLine();
        b=s.nextLine();
        BMI(a,b);

    }


}
