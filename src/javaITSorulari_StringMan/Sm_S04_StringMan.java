package javaITSorulari_StringMan;

public class Sm_S04_StringMan {
    public static void main(String[] args) {
       //Bir Dize değişkeni oluşturun, Dize'deki rakam
        // olmayan karakterlerin sayısını yazdırın

        String str="1a3Bcf4!...";
        String ystr=str.replaceAll("\\d","");
        System.out.println(ystr.length());
    }
}
