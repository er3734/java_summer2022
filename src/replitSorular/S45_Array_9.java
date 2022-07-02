package replitSorular;

public class S45_Array_9 {
    public static void main(String[] args) {
     //   Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.

       //         Array: [1,2,3,4,5,6,7,8,9]

        int[]sayilar={1,2,3,4,5,6,7,8,9};
        int tek=0;
        int cift=0;
        for (int i = 0; i <sayilar.length; i++) {
            if (sayilar[i]%2==0){
                cift++;
            } else{
            tek++;
        }}
        System.out.println(tek+" adet tek syı ve "+cift+" adet çift sayı vardır" );
    }
}
