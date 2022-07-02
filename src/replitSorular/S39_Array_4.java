package replitSorular;

import java.util.Arrays;

public class S39_Array_4 {
    public static void main(String[] args) {
        /*Aşağıdaki grid şeklini yazan Java Kodunu yazınız.
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
 0  0  0  0  0  0  0  0  0  0
        * */
        int sifirlar[][]=new int[10][10];
        for (int i = 0; i <sifirlar.length ; i++) {
            for (int j = 0; j <sifirlar.length ; j++) {
                sifirlar[i][j]=0;
                System.out.print(sifirlar[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
