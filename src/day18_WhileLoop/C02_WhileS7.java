package day18_WhileLoop;

public class C02_WhileS7 {
    public static void main(String[] args) {
        int input=54321;

        int rakamlarToplami=0;
        int birlerBasamagi=0;
        int temp=input;

       while (temp>0){
           birlerBasamagi=temp%10;
           rakamlarToplami+=birlerBasamagi;
           temp/=10;
       }
        System.out.println(input+" input sayısının rakamlar toplamı : "+ rakamlarToplami);
    }
}
