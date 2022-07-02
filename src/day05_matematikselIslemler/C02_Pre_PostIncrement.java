package day05_matematikselIslemler;

public class C02_Pre_PostIncrement {
    public static void main(String[] args) {

        int sy=10;

        System.out.println("pre-increment : " + ++sy);//pre--önce artır sonra yazdır sy=11

        System.out.println("post-increment : " + sy++);//post--önce yazdır sonra artır sy=10 yazr ama sy 11 olur

        System.out.println("post_incrementten sonra : " + sy);//sy =12
    }
}
