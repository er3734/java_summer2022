package day05_matematikselIslemler;

public class C01_Pre_PostIncrement {
    public static void main(String[] args) {
        int say1=10;

        int say2=say1+1;//11

        int say3=say2++;//11

        int say4=++say1;//

        System.out.println("say3 : " + say3);
        System.out.println("say2 : " + say2);
        System.out.println("say1 : " + say1);
        System.out.println("say4 : " + say4);

        int a=5;

        System.out.println(a++);
    }
}
