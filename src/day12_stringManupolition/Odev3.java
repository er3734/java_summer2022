package day12_stringManupolition;

public class Odev3 {
    public static void main(String[] args) {

        String isim="htice";

        if (isim.contains("a")){
            System.out.println("Girdiğiniz isim a ve içeriyor");
        }
        if (isim.contains("Z")){
            System.out.println("giridğiniz isim ,Z iceriyor");
        }
        if (!(isim.contains("a")||isim.contains("Z"))){
            System.out.println("ikisde yok");
        }
    }
}
