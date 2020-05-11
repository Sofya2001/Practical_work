package Practice_2;

public class Task_3 {
    private static boolean isAvgWhole(double[] mas){
        // double sr;
        double s=0;
        for (double x:mas) { // пербор значений в массиве
            s = s + x; // сложение значений на каждой итерации
        }
        if(s%mas.length==0) return true; // проверка условия среднего значения
        else return false;
    }
    public static void main(String[] args){
        double[] a = {1, 5, 6};
        System.out.println("Результат: " + isAvgWhole(a));
    }
}
