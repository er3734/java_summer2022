package javaITSorulari_StringMan;

public class Sm_S03_StringMan {
    public static void main(String[] args) {
        //Bir String değişkeni oluşturun, konsoldaki String'deki
        // toplam alfabetik ve sayısal karakter sayısını yazdırın.
        String str="Miami 33018!!!";
        String ystr=str.replaceAll("\\W","");
        System.out.println(ystr.length());


    }
}
