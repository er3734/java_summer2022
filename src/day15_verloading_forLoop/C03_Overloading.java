package day15_verloading_forLoop;

public class C03_Overloading {
    public static void main(String[] args) {
        topla(5, 7);//12
        topla(5.2,3);//8.2
        topla(3.4,5.1);//8.5
    }
    public static void topla(int sayi1, int sayi2) {
        System.out.println("iki int ın toplamı : " + (sayi1 + sayi2));
    }

    public static void topla(double sayi1, int sayi2) {
        System.out.println("bir dob. ve bir int ın toplamı : " + (sayi1 + sayi2));
    }

    public static void topla(int sayi1, double sayi2) {
        System.out.println("bir int bir dob ın toplamı : " + (sayi1 + sayi2));
    }

    public static void topla(double sayi1, double sayi2) {
        System.out.println("iki dob. ın toplamı : " + (sayi1 + sayi2));
    }
}


