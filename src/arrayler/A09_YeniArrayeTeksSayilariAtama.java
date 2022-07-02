package arrayler;

import java.util.Arrays;

public class A09_YeniArrayeTeksSayilariAtama {
    public static void main(String[] args) {
        //Java Dizideki Tek Sayıları Başka Diziye Atan Program
        int dzi[]={3,2,4,11,67,55,32,66,77,101,23};
        int tek=0;
        for (int i = 0; i <dzi.length ; i++) {
            if (dzi[i]%2!=0){
                tek++;
            }
        }
        int []yeniDizi=new int[tek];
        int yeniDiziIndex=0;
        for (int i = 0; i <dzi.length ; i++) {
            if (dzi[i]%2!=0){
                yeniDizi[yeniDiziIndex]=dzi[i];
                yeniDiziIndex++;
            }

        }
        System.out.println(Arrays.toString(yeniDizi));
    }
}
