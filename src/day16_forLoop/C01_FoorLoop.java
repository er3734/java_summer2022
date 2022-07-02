package day16_forLoop;

public class C01_FoorLoop {
    public static void main(String[] args) {
        //verilen bir poz. tam sayının
        //poz tam bölenlerini yazdıealım

        int input=120;

        for (int i = 1; i <=input ; i++) {
            if (input%i==0){
                System.out.println(i+" ");
            }

        }

    }
}
