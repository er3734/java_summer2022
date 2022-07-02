package replitSorular;

public class S31ForWhile6 {
   /* Konsolda Alfabeyi Yazdıran programi yaziniz.

            ÇIKTI :
    abc .. .. .. yz*/
   public static void main(String[] args) {

      for (char i = 'a'; i <='z' ; i++) {
         if (i < 'z') {
            System.out.print(i + ",");
         }else
            System.out.println(i);
      }
   }
}
