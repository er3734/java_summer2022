package day17_nestedForLoop;

public class C12 {
    /*
     1 ile 50 arasındaki  tek sayıları yazdır
     */
    public static void main(String[] args) {
        int a = 1;
        while (a<=50){
            if(a%2!=0){
                a++;
                continue;
            }
            System.out.println("a = " + a);
            a++;
        }
    }
}
