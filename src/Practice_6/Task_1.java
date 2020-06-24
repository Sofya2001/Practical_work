package Practice_6;

import java.util.Scanner;

public class Task_1 {
    private static int bell(int a){
    int[][] ar=new int[a][a];
    ar[0][0]=1;
    for (int i=1;i<a;i++){
        for (int j=1;j<=i;j++){
          ar[i][0]=ar[i-1][i-1];
          ar[i][j]=ar[i][j-1]+ ar[i-1][j-1];
        }


    }
        for (int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
return ar[a-1][a-1];
    }
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int a=s.nextInt();
      System.out.println("Результат: "+ bell(a));
   }




}
