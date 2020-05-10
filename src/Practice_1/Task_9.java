package Practice_1;

public class Task_9 {
private static double sumOfCubes(double sums[]){ // создание метода, где входным параметром является массив
    double s=0;
    for(double x: sums){ // перебор каждого значения в массиве
     s=s+Math.pow(x,3); //вычисление суммы кубов при каждой итерации
    }
    return s;
}
public static void main(String[] args){
    double sums[]={3,4,5}; //  объявление массива
    System.out.println(sumOfCubes(sums));
}

}
