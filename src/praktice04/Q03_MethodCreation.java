package praktice04;

import java.util.Scanner;

public class Q03_MethodCreation {
       /*
  Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....
  */
       public static void main(String[] args) {
           Scanner scan=new Scanner(System.in);
           System.out.println("lutfen bir tam sayi giriniz");
           int n= scan.nextInt();
           int n1=0,n2=1,n3;
           System.out.print(n1+" "+n2);
           for (int i = 2; i <=n ; i++) {
               n3=n1+n2;
               System.out.print(" "+n3);
               n1=n2;
               n2=n3;
           }
           System.out.println();

           }
}
