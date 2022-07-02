package day22_MultiDimensionalArray;

import java.util.Arrays;

public class C04_02_Mda {
    public static void main(String[] args) {
        /*Soru 4) Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin
         toplamini  birer birer bulan ve herbir sonucu yeni bir array’in elemani yapan
          ve yeni array’i  ekrana  yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6,7} }
         Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
         */

        int[][]sayilar= {{1,2,3}, {4,5}, {6,7}};
        int[] yarr=new int[sayilar.length];
        int carpım=1;
        for (int i = 0; i <sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length ; j++) {
                carpım*=sayilar[i][j];
            }
            yarr[i]=carpım;
            carpım=1;
        }
        System.out.println(Arrays.toString(yarr));
    }
}
