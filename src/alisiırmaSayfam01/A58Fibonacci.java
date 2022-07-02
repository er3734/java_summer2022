package alisiırmaSayfam01;

public class A58Fibonacci {
    public static void main(String[] args) {
        int input=7;
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2);
        for (int i =2 ; i <=input ; i++) {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
       // System.out.print();
    }
}
