package day15_verloading_forLoop;

public class C08_Faktoriyel {
    public static void main(String[] args) {
        /*
        input olarak ver. bir tam sayı için fak. hesaplayıp yazdıran
         bir method oluturun
         verielne sayı neg. veya 20 de buyukten olursa girilen
         say. fak.hesaplanamaz uayarısı yazdırınız
         */
        int input=6;
        faktoriyelHesapla(input);
        faktoriyelHesapla(7);
        faktoriyelHesapla(19);
        faktoriyelHesapla(0);
        faktoriyelHesapla(-3);
        faktoriyelHesapla(21);

    }
    public static void faktoriyelHesapla(int input) {
        int fak=1;

        if (input<0||input>20){
            System.out.println("verieln sayı için hesaplanamaz");
        } else if (input==0) {
            System.out.println("0! = 1");
        }else {
            for (int i = 1; i <=input ; i++) {
                fak*=i;
            }
            System.out.println("fak = " + fak);
        }
    }
}
