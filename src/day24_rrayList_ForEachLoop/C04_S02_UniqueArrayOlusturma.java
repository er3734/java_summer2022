package day24_rrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_S02_UniqueArrayOlusturma {
    public static void main(String[] args) {
       // Soru 2) Verilen bir array’deki tekrar eden tek bir defa barındıran
        // elementleri yeni bir array olarak donduren bir method olusturun

        int arr[]={2,3,5,6,3,5,4,1,9,6,3,5,5};

        int[]uniqueArray=uniqueArrayOlustur(arr);
        System.out.println(Arrays.toString(uniqueArray));
    }

    public static int[] uniqueArrayOlustur(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 6, 9]
        List<Integer>benzersizList=new ArrayList<>();
        //yanındaki elemente eşit olmayanları listeye ekliyor
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i]!=arr[i+1]){
                benzersizList.add(arr[i] );
            }
        }
        //son elemnti kontrol edip yoksa listeye ekliyoruz
        if (!benzersizList.contains(arr[arr.length-1])){
            benzersizList.add(arr[arr.length-1] );
        }

        //benzersiz List==>1,2,3,4,5,6,9

        int []tekrarsizArr=new int[benzersizList.size()];
        //benzersizlisteki tüm elemanları yeni arraye atadık
        for (int i = 0; i < tekrarsizArr.length ; i++) {
            tekrarsizArr[i]=benzersizList.get(i);

        }
        return tekrarsizArr;
    }
}
