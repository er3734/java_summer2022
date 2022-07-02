package replitSorular;

import java.util.Scanner;

public class S17 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen dakika giriniz");
        int dk= scan.nextInt();

        double gun=dk/(60*24);
        int yıl= (int) (gun/365);
        int g= (int) (gun%365);


        System.out.println(dk + " dakika yaklaşık " + yıl+ " yıl " + g+ " gündür");


    }
}
