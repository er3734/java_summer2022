package replitSorular;

import java.util.Arrays;

public class S43_Array_8 {
    public static void main(String[] args) {
        //Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

               // Array: [1232,2345,5467,678,3454,2312,3451]
        int[]dizi={1232,2345,5467,678,3454,2312,3451};
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
        System.out.println(dizi[dizi.length-2]);
    }
}
