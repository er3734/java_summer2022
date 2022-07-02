package alisiırmaSayfam01;

public class A0_WhileForKarekter {
    public static void main(String[] args) {


        /*for (char i = '0'; i <= 255; i++) {

            System.out.println( i + "-->" );
        }*/
        int sayı=0;
        while(sayı<=255){
            char kar= (char) sayı;
            System.out.println(sayı + "-->" + kar);
            sayı++;

        }


    }
}
