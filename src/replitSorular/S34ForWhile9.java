package replitSorular;

<<<<<<< HEAD
import java.util.Scanner;

=======
>>>>>>> 7e6f873aecd00867db15615b9dbce48ba4389557
public class S34ForWhile9 {
   /* Kullanıcının girdiği sayıyı tersine çeviren
   bir java programı yazınız. (Mulakat Sorusu)

    Giriş :1238

    Output :Girilen Numananin Tersi: 8321*/
<<<<<<< HEAD
   public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("bir sayı giriniz");
       int a= scan.nextInt();
       sayiTersCevirme(a);

   }
   public static int sayiTersCevirme(int a){
       String stra=String.valueOf(a);
       String ters="";

       for (int i = stra.length()-1; i >=0 ; i--) {
           ters+=stra.substring(i,i+1);
       }
       int yters=Integer.parseInt(ters);
       System.out.println("yters = " + yters);
       return yters;
   }
=======
>>>>>>> 7e6f873aecd00867db15615b9dbce48ba4389557
}
