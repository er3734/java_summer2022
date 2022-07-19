package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C10_S01 {
    public static void main(String[] args) {

        //Soru 1) Verilen bir array’deki tekrar eden elementleri yazdirin.

        int arr[]={2,3,5,3,2,6,85,9,2,5,78,32,2,3,5,78,9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer> tekrarEden=new ArrayList<>();
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
