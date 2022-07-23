package replitSorular;

public class ConditionalStatement_S10 {
    public static void main(String[] args) {
        /*
        5 satırlık paskal üçgenini yazdıran Java kodunu yazınız.
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
         */
        int sayi=5;
        for (int i = 0; i <=sayi ; i++) {
            for (int j = 0; j <sayi-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i ; j++) {
                System.out.print("1");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
