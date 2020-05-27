package Practice_4;

import java.util.Scanner;

public class Task_4 {
    private static double overTime(double array[]){
        double z=0;
           if(array[0]>=9 && array[1]>17)  z=((17-array[0])*array[2])+((array[1]-17)*(array[2]*array[3]));//проверка и вычисление свехурочных выплат
           if (array[0]>9 && array[1]<=17) z=(array[1]-array[0])*array[2];//проверка и вычисление выплат рабочего дня
           return z;
    }

    public static void main(String[] args) {
        double a[]=new double[4];
        double ch;
        Scanner s = new Scanner(System.in);
        for(int i=0;i<4;i++){ //ввод 4 значений в массив
            ch=s.nextDouble();
            a[i]=ch;
        }
        System.out.printf("$ %f",overTime(a));
    }
}
