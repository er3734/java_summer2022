package replitSorular;

public class ConditionalStatement_S09 {
    public static void main(String[] args) {
        /*
        Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.

      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *
         */
        int sayi=7;

        for (int i = 0; i <sayi ; i++) {
            for (int j = 0; j <sayi-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = sayi-1; i >=0 ; i--) {
            for (int j = sayi; j >=i ; j--) {
                System.out.print(" ");
        }
            for (int j = i-1; j >=0 ; j--) {
                System.out.print("*");
            }
            for (int j = i-1; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
