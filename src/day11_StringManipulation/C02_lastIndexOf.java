package day11_StringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String cumle="Java cok kolay, Java cok guzel";
        String kelime="Java";

        /*
        verilen kelime için aşağ.daki şsartylardean uygun olanı yazın

        -verilen kelime cumlede kullanılmamaısş
        -verilen kelime cumlede 1 kere
        -verilen kelimede cumle 1 den fazla
         */


        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1){
            System.out.println("kullanılmamıs");
        } else if (kelimeIlkIndex==kelimeSonIndex) {
            System.out.println("1 kere kullanılmıs");
        }else{
            System.out.println("birden fazla");
        }

    }
}
