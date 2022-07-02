package replitSorular;

public class S41_Array_6 {
    public static void main(String[] args) {
       /* Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

                Array: [12,15,43,23,56,76,78,90,77,43]
                Aranan değer:56
                */
        int arr[]={12,15,43,23,56,76,78,90,77,43};
        int arananDeger=77;
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==arananDeger){
                System.out.println(arr[i]);
            break;}
            sayac++;

        }
        System.out.println(arananDeger+" dizinin " +sayac+".elementi");

    }
}
