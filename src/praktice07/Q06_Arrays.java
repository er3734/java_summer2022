package praktice07;

public class Q06_Arrays {

       /*

    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
       public static void main(String[] args) {
           int dizi[]={5,67,454,232,546,12,232,1};
           int min=dizi[0];
           int max=dizi[0];
           for (int i = 0; i <dizi.length ; i++) {
               if (min>dizi[i]){
                   min=dizi[i];
               }
               if (max<dizi[i]){
                   max=dizi[i];
               }

           }
           System.out.println("fark = " +(max -min));
       }

}
