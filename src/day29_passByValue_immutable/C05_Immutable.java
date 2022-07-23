package day29_passByValue_immutable;

public class C05_Immutable {
    public static void main(String[] args) {

        String isim="Mine";
        isim=isim.toUpperCase();

        System.out.println(isim);//MİNE

        isim="mevlut";

        System.out.println(isim);//mevlut

        for (int i = 0; i <100 ; i++) {
            isim+=".";
        }
        System.out.println(isim);


    }
}
