package day21_Arrays;

import java.util.Arrays;

public class C12_CokBoyutluS04 {
    /*
    Soru 4) Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin
    toplamini birer birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve
     yeni array’i ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6,7} }
     Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
     */
    public static <arr1> void main(String[] args) {
        int arr1[][]={{1,2,3},{4,5},{6,7},{8,9}};
        System.out.println(arr1.length);
        int arrTop[]=new int[arr1.length];
        int top=0;
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr1[i].length ; j++) {
                top+=arr1[i][j];
            }
            arrTop[i]=top;
            top=0;
        }
        System.out.println(Arrays.toString(arrTop));

    }
}
