package praktice_06;

import java.util.Scanner;

public class Q03_DoWhileLoop {

      /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */
      public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            String str="";
            do {
                  System.out.println("bir harf giriniz");
                  str=scan.next();
                  System.out.println("program çalışıyor");
            }while (!(str.equals("x")));
            System.out.println("program bitti");





      }
}
