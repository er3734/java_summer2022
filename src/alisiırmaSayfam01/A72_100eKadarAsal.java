package alisiırmaSayfam01;

public class A72_100eKadarAsal {
    public static void main(String[] args) {

        int a=100;
        for (int i = 2; i <=a ; i++) {
            int sayac=0;
            for (int j = 2; j <i; j++) {
                if (i%j==0){
                    sayac=1;
                    break;
                }
            }
            if (sayac==0){
                System.out.print(i+",");
            }
        }
    }
    }

