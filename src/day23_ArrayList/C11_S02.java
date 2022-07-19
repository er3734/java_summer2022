package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C11_S02 {
    public static void main(String[] args) {
        int[]dizi={2,3,5,3,2,6,85,9,2,5,78,32,2,3,5,7,9};


        benzersizArray(dizi);

    }

    private static void benzersizArray(int[] dizi) {

        Arrays.sort(dizi);
        List<Integer>uniqueList=new ArrayList<>();
        for (int i = 0; i < dizi.length ; i++) {
            uniqueList.add(dizi[i]);
        }
        List<Integer>benzersi=new ArrayList<>();
        System.out.println(uniqueList);
        for (int i = 0; i <uniqueList.size() ; i++) {
            if (uniqueList.indexOf(uniqueList.get(i))==uniqueList.lastIndexOf(uniqueList.get(i))){
                benzersi.add(uniqueList.get(i));
            }
        }
        System.out.println(benzersi);


    }
}
