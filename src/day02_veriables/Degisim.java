package day02_veriables;

public class Degisim {
    public static void main(String[] args) {
        int s1=30;
        int s2=20;
        System.out.println("ilk hali s1: " + s1 + " ilk hali s2 : " + s2);

        s1=s1-s2; //s1=+10
        s2=s1+s2;//s2=30
        s1=s2-s1;//s1=20

        System.out.println("son hali s1 : " + s1 + " son hali s2 : " + s2);


    }
}
