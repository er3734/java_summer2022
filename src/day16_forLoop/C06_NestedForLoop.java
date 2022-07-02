package day16_forLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*
        bazen tek değişken soruunu cozmeye yetmez
        *
        **
        ***
        ****
        *****
         */
        //3 tane yıldız yanyana
        System.out.println("");
        for (int i = 1; i <=3 ; i++) {
            System.out.print("*");
        }
        System.out.println("");//alt satıra gecirmek için
        //bu tur durumlarda nested loop kullanılır
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
