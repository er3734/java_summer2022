package alistirmaSayfam02;

public class A20_DoWhile {
    public static void main(String[] args) {
        /*
   SORU2 : Bir top belirli bir yukseklikten bırakılmaktadır.
   Bırakıldıktan  sonra, bırakıldığı yuksekligin 3/4'ü kadar yerden yukari doğru ziplamaktadir
   Top; ziplama yuksekligi 1 metrenin altina indiginde durmaktaadir
   Bu ana kadar aldigi toplam yolu ve yere vurma sayisini bulan kodları do - while ile çözünüz
    */
        double  yukseklik=2;
        int sayac=0;
        double yol=yukseklik;
     do {
         yukseklik=(yukseklik*3)/4;
         yol+=2*yukseklik;
         sayac++;

         System.out.println("   Yükseklik :"+yukseklik+ "   Aldığı yol : "+yol);

     }while (yukseklik>1);
        System.out.println("toplam : "+sayac);
        System.out.println("toplam alınan yol : "+yol );

    }
}
