package alistirmaSayfam02;

import java.util.ArrayList;
import java.util.List;

public class A24_ForEachS04 {
    public static void main(String[] args) {
        String str="hayat cok güzel";
        String[]arr=str.split("");
        List<String>liste=new ArrayList<>();
        for (String w:arr
             ) {
            System.out.print(w+" ");
            liste.add(w);
        }
        System.out.println();
        System.out.println("liste = " + liste);
    }
}
