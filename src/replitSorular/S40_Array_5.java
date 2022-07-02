package replitSorular;

public class S40_Array_5 {
    public static void main(String[] args) {
        //yazılan değerin array içerisinde arayan Java Kodu yazınız.

        //Array: [1551,1223,1443,1267,1789,1023,2020]

        int dizi[]={1551,1223,1443,1267,1789,1023,2020};
        int aranan=2020;
        boolean sonuc=false;
        sonuc=dizideArama(dizi,aranan);
        if (sonuc) {
            System.out.println("aranan sayı dizide var");
        }else
            System.out.println("aranan sayı dizide yok");
        }

    private static boolean dizideArama(int[] dizi, int aranan) {
        boolean varMı=false;
        for (int i = 0; i <dizi.length ; i++) {
            if (aranan==dizi[i]){
            varMı=true;}

        }
        return varMı;
    }
}
