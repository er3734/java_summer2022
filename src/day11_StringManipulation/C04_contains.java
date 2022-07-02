package day11_StringManipulation;

public class C04_contains {
    public static void main(String[] args) {
        
        String cumle="Java , dunya ";
        
        
        if (cumle.contains("buyuk")&&cumle.contains("kucuk")) {
            System.out.println("karar ver hangisini yazdırayım");
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        }else {
            System.out.println("cumle kucuk yada buyu icermiyor");
        }
    }
}
