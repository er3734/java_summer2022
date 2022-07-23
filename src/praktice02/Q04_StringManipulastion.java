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
<<<<<<< HEAD
        String str=scan.next();
        
        char ortancaKar=str.charAt((str.length()-1)/2);
        
        if (str.length()%2==1&&str.length()>=3){
            System.out.println("ortancaKar = " + ortancaKar);
        }

        //if (str.length()%2==1&&str.length()>=3)
            //System.out.println(str.substring(str.length()/2,str.length()/2+1));
=======
        String str=scan.nextLine();

        if (str.length()%2==1||str.length()>=3)
            System.out.println(str.substring(str.length()/2,str.length()/2+1));
>>>>>>> 7e6f873aecd00867db15615b9dbce48ba4389557
    }
}