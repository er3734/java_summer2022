package replitSorular;

public class S38_Array_3 {
    public static void main(String[] args) {
        //Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

        //Array = [20, 30, 25, 35, -16, 60, -100 ]
        int dizi[]={20, 30, 25, 35, -16 , 60, -100 };

       double ort= ortalamaArray(dizi);
        System.out.println(ort);
    }

    private static double ortalamaArray(int[] dizi) {
        double ort=0;
        double toplam=0;
        for (int i = 0; i <dizi.length ; i++) {
            toplam+=dizi[i];

        }
        ort=toplam/dizi.length;
        return ort;
    }
}
