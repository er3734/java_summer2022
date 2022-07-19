package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_02_TekrarEdenSayilar {
    public static void main(String[] args) {

        //Soru 1) Verilen bir array’deki tekrar eden elementleri yazdirin.

        int arr[]={3,4,2,4,1,8,6,4,3,1,9,7,53,12};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer>tekrarEden=new ArrayList<>();
        for (int i=0;i<arr.length-1;i++) {
            if (arr[i]==arr[i+1]){
                if (!tekrarEden.contains(arr[i])){
                    tekrarEden.add(arr[i]);
                }
            }
        }
        System.out.println(tekrarEden);
    }
}
