package Practice_2;

public class Task_4 {
    private static void cumulativeSum(int[] mas){
        int s=0;
        int[] mas1=new int[mas.length]; // создание нового массива размером с входящего в метод массива
       for(int i=0; i<mas.length;i++){
           mas1[i]=s+mas[i]; // запись в новый массив значения входного+сумма предыдущих значений
           s=mas1[i];
       }
       for(int x:mas1) // перебор значений нового массива
        System.out.print(" " + x); // вывод новых значений массива
        }

    public static void main(String[] args){
        int[] a = {1, -2, 3};
        cumulativeSum(a);
    }
}
