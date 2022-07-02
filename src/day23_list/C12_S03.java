package day23_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12_S03 {
    public static void main(String[] args) {
        List<String>isimler=new ArrayList<>();

        String isim="";

        belirliBirHarf(isimler,isim);


    }

    private static void belirliBirHarf(List<String> isimler, String isim) {
        Scanner scan=new Scanner(System.in);
        while (!isim.equals("Q")){
            System.out.println("lutfen bir isim giriniz");
            isim=scan.next();
            if (!(isim.equals("Q"))) {
                isimler.add(isim);}
        }

        System.out.println(isimler);
    }
}
