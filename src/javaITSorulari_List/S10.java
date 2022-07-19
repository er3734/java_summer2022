package javaITSorulari_List;

import com.sun.jdi.DoubleValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S10 {
    public static void main(String[] args) {
        //Bir String listesinde verilen en küçük ve en büyük fiyatın toplamını bulun
        //Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70

        List<String>fiyatlar=new ArrayList<>();
        fiyatlar.add("$12.99");
        fiyatlar.add("$8.25");
        fiyatlar.add("$23.60");
        fiyatlar.add("$54.45");

        List<Double>fiyatlarInt=new ArrayList<>();
        for (String w:fiyatlar
             ) {
            double fiyat=Double.valueOf(w.replace("$",""));
            fiyatlarInt.add(fiyat);
        }
        Collections.sort(fiyatlarInt);
        double top=fiyatlarInt.get(0)+fiyatlarInt.get(fiyatlarInt.size()-1);
        System.out.println("top = " + top);
    }
}
