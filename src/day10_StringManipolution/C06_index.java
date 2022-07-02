package day10_StringManipolution;

public class C06_index {
    public static void main(String[] args) {

        String str1="Java ogrenmek cok guzel";

        System.out.println(str1.indexOf("o"));//5
        System.out.println(str1.indexOf('g'));//6
        System.out.println(str1.indexOf("t"));//bana int dödürüyor int yok diye bir şey yok

        String str5=
                "meoejfıdjcmsğaspsğcnıwedsmxlçlşl<sxspwsdk";
        // str5 de p varmıdır
        if (str5.indexOf("p")!=-1){
            System.out.println("p vardır");
        }else {
            System.out.println("p yoktur");
        }

       }
}
