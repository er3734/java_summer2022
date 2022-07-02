package replitSorular;

public class S37_Array_2 {
    public static void main(String[] args) {
       // Array deki sayıları tolpayan Java kodunu yazınız.

               // array [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        int dizi[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int arrayToplam=dizidekileriTopla(dizi);
        System.out.println(arrayToplam);
    }

    public static int dizidekileriTopla(int[] dizi) {
        int toplam=0;
        for (int i = 0; i <dizi.length ; i++) {
            toplam+=dizi[i];
        }

        return toplam;
    }
}
