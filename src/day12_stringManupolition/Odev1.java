package day12_stringManupolition;

public class Odev1 {
    public static void main(String[] args) {

        //Java ogrenmek123 Cok guzel@ ini Java ogrenmek cok guzel e cevir

        String a=" Java ogrenmek123 Cok guzel@ ";


        a=a.trim();
        //a=a.replaceAll("\\s","qwyz");
        a=a.replaceAll("\\d","");
        //a=a.replaceAll("\\W","");
        a=a.replace("@",".");
        a=a.replace("C","c");
        System.out.println(a);



    }
}
