package day22_MultiDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        /*
        array,i array yapan sembol [] idi
        arraylist de ise <> diomond kullanilir
         */
        List<String>isimler=new ArrayList<>();
        System.out.println(isimler);//[]

        //bir liste eleman eklemek istersek
        isimler.add("Başak");
        System.out.println(isimler.add("Ayşe"));//true dödürür

        /*
        string de bir method çalıstırdığımızda assign yapmazsak
        string değişmiyordu
         */
        System.out.println(isimler);//[Başak, Ayşe]
        /*
        list2in tek kötü tarafi array alt yapısını kullandığı için elemanları
        birer bbirer eklemek zorunda olmamızdır.
         */
    }
}
