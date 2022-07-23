package alıstırmaSayfam;

public class A54For {
    public static void main(String[] args) {
        int a=30;
        for (int i=1;i<=a;i++){

            if (i%15==0){
                System.out.println("java guzeldir");
            } else if (i%5==0) {
                System.out.println("guzeldir");
            } else if (i%3==0) {
                System.out.println("java");
            }else
                System.out.println("i = " + i);
        }
    }
}
