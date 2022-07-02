package day07_ifStatments;

public class C03_isStatment {
    public static void main(String[] args) {
        int a=-133;

        if (a>0)
            System.out.println("sayı pozitif");
            System.out.println("sayı poz kalacaktır");//her şartta çaalısır
        if (a%2==0)
            System.out.println("sayı çift");
            System.out.println("sayı çift kalacaktır");//{ olmadığında her şartta çalışır
        if (a%5==0)
            System.out.println("sayı 5in katı");

        /*
        bir if statmentta { kulanılmazsa java ilk satırı
        şart ile bağlar sonraki satırlar bağımsız olur
         */

        }
}
