package replitSorular;

public class S32ForWhile7 {
   /* Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.

    Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.
            Giriş :
            6
    Çıktı:
            6 Mukemmel Sayidir.
            ======================
    Giriş 7
    Çıktı:7 Mukemmel Sayidir degildir.*/
   public static void main(String[] args) {
       int sayi=8;
       int top=0;
       for (int i = sayi-1; i >=1 ; i--) {
           if (sayi % i == 0) {
               top += i;
           }
       }
           if (top==sayi){
               System.out.println("mukemmel sayı");
           }else {
               System.out.println("mukemmel sayı değilidr");
           }
   }
}
