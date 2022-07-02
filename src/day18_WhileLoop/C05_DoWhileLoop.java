package day18_WhileLoop;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
        /*
       9'dan 190'a kadar 7^nin kati olan tum tam sayilari ekrana yazdiriniz
         */

        int bas=9;
        int bit=190;
        int temp=bas;

        //while ile
        while (temp<bit){
            if (temp%7==0){
                System.out.print(temp + " ");
            }
            temp++;
        }
        //do While ile
        temp=bas;
        System.out.println();
        do {
            if (temp%7==0){
                System.out.print(temp + " ");
            }
            temp++;
        }while (temp<bit);
    }
}
