package replitSorular;

import java.util.Scanner;

public class S25 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String isim= scan.nextLine();
        System.out.println(isim.substring(isim.length()-2).
                concat(isim.substring(isim.length()-2)).
                concat(isim.substring(isim.length()-2)));
    }
}
