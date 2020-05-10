package Practice_1;


public class Task_6 {
    private static int ctoa(char ch){
        return (int) ch; // конвертация из символьного типа в числовой
    }
    public static void main(String[] args){
        char a='A';

        System.out.println("Результат:" + ctoa(a));
    }
}
