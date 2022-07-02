package day23_list;

import java.util.Arrays;

 public class C10_S01 {
    public static void main(String[] args) {
        int[]dizi={2,3,5,3,2,6,85,9,2,5,78,32,2,3,5,78,9};
        int syac=0;
        for (int i = 0; i <dizi.length ; i++) {
            for (int j = i; j < dizi.length ; j++) {
                if (dizi[i]==dizi[j]){
                 syac++;
                }
            }
        }
        System.out.println(syac);

    }
}
