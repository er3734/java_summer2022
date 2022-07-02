package day11_StringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {
        String str1="Java ogrenmek cok guzel";

        System.out.println(str1.indexOf('g'));//6
        System.out.println(str1.indexOf("r"));//7
        System.out.println(str1.indexOf("j"));//olmadığı i.in -1
        System.out.println(str1.indexOf("mek"));//metin olarak arar ve index olaral ilk harfı alır=11

        /*
        eğer istediğimiz indexten sonrasını kontrol etmek istersek
        o zamn aynı methodu iki parametreli olarak kullanabiliriz
         */

        System.out.println(str1.indexOf("g",6));//yazılan indexten başlar

        //yuk.daki str da 2.ve 3. e nin indexisini bulun
        //2.yi bulmak için 1. ye ihtiyacım var

        int ilke= str1.indexOf("e");
        int ikincie=str1.indexOf("e",ilke+1);

        // eğer 2. varsa  3. enin olup ıolmadığını
        //ve varsa index ini yazdıralım

        if (ikincie==-1){
            System.out.println("verilen str 2. e yok");

        }else {
            int ucuncue= str1.indexOf("e",ikincie+1);
            if (ucuncue==-1){
                System.out.println("3. eyok");
            }else {
                System.out.println("3. e var indexi : " + ucuncue);
            }
        }








    }
}
