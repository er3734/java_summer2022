package alıstırmaSayfam;

import java.util.Locale;

public class A51 {
    public static void main(String[] args) {

        String ay="MArt";
        ay=ay.toLowerCase();

        switch (ay){
            case "aralık":
            case "ocak":
            case "subat":
                System.out.println("mevsim kış");
                break;
            case "mart":
            case "nisan":
            case "mayıs":
                System.out.println("mevsim ilkbahar");
                break;
            case "haziran":
            case "temmuz":
            case "ağustos":
                System.out.println("mevsim yaz");
                break;
            case "eylül":
            case "ekim":
            case "kasım":
                System.out.println("mevsim sonbahar");
                break;
            default:


        }
    }
}
