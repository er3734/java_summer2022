package alistirmaSayfam02;

import java.util.Arrays;

public class A14_ArraySoru {
    public static void main(String[] args) {
        // Verilen bir metin içinde kullanılan harfleri,
        // bir diziye aktarın ve yazdırın.
       // metinde kullanılan bir karakter diziye
        // daha önce aktarılmış ise ikinci defa aktarılmayacaktır.
      // Boşluklar diziye aktarılmayacaktır.
        // Oluşturulacak Char dizinin eleman sayısı içine
        // aktarılacak karakter adeti olacaktır.


        String metin = "Ey Türk gençliği! Birinci vazifen;" +
                "Türk istiklalini, Türk cumhuriyetini, " +
                "ilelebet muhafaza ve müdafaa etmektir";
        String temp=metin.replaceAll("\\s","");
        String tekrasizTemp="";
        for (int i = 0; i <temp.length() ; i++) {
            if (!(tekrasizTemp.contains(temp.substring(i,i+1)))){
                tekrasizTemp+=temp.substring(i,i+1);
            }
        }
        /*System.out.println(tekrasizTemp);
        String tempDizi[]=tekrasizTemp.split("");
        System.out.println(Arrays.toString(tempDizi));
        System.out.println(tekrasizTemp.length());*/
        char ydizi[]=new char[tekrasizTemp.length()];
        for (int i = 0; i <tekrasizTemp.length() ; i++) {
            ydizi[i]+=tekrasizTemp.charAt(i);
        }
        System.out.println(Arrays.toString(ydizi));

    }
}
