package praktice02;

import java.util.Scanner;

public class Q04_StringManipulastion {
    /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String str=scan.nextLine();

        if (str.length()%2==1||str.length()>=3)
            System.out.println(str.substring(str.length()/2,str.length()/2+1));
    }
}