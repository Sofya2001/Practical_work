package Practice_6;

public class Task_4 {
    private static String stripUrlParams(String str){
       String str1="";
       int n=0;
       for (int i=0;i<str.length();i++){
           if(str.charAt(i)!='?'){
               str1=str1+str.charAt(i);
               n++;
           }
          else break;
       }
       char a1 = '0';
       char b1='0';
      for (int i=n+2;i<str.length();i++){
          if(str.charAt(i)=='a'){
               a1=str.charAt(i+2);
          }
          if(str.charAt(i)=='b'){
              b1=str.charAt(i+2);
          }
      }
      return str1+"?"+"a="+a1+"&"+"b="+b1;
    }

    public static void main(String[] args) {
        System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2"));
    }
}
