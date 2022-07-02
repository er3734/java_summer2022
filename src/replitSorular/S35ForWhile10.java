package replitSorular;

public class S35ForWhile10 {
   /* 1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.
            Çıktı:
    Toplam sayılar: 5050*/
   public static void main(String[] args) {
       int top=0;
       for (int i = 1; i <=100 ; i++) {
           top+=i;
       }
       System.out.println("toplam sayilar = " + top);
   }
}
