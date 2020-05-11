package Practice_2;

public class Task_2 {
    private static double differenceMaxMin(double[] mas){
        double max=4.9*Math.pow(10,-324); // объявление минимального максималного значения
        double min=1.8*Math.pow(10,308); // объявление максималного минимального значения
        for (double x:mas){ // перебор значений в массиве
            if (x>max) max=x;
            if(x<min) min=x;
        }
        return max-min;
    }
    public static void main(String[] args){
        double[] a = {10, 4, 1, 4, -10, -50, 32, 21};
        System.out.println("Результат: " + differenceMaxMin(a));
    }
}
