package day14_methodCreation;

import java.util.Scanner;

public class C06_MyMethod {

    public static void main(String[] args) {
        ciftMi(5);
        gunler("pazatesİ");
        gunler("SALI");
        ciftMi(9);
        ciftMi(8);
        gunler("pazar");
        ciftMi(11);
        gunler("cumar");
        karelerTop(3,4,2);
        karelerTop(5,45,23);
        isimYas();
        isimYas();
        isimYas();

    }
    public static void ciftMi (int input){
        if (input%2==0){
            System.out.println("input çift");
        } else if (input%3==0) {
            System.out.println("input 3 ün katı");
        } else if (input%5==0) {
            System.out.println("input 5 in katı");
        }else{
            System.out.println("istediğimiz input değil");}
    }

    public static void gunler(String gun){

        switch (gun.toLowerCase()){
            case "pazartesi":
            case "salı":
            case "carşamba":
            case "perşembe":
            case "cuma": System.out.println("haftaiçi");break;
            case "cumartesi":
            case "pazar": System.out.println("hafta sonu");break;
            default: System.out.println("yanlış giriş");}
    }
    public static void karelerTop(int a,int b,int c){
        //int a=5;
        //int b=7;
        //int c=9;
        System.out.println((a*a)+(b*b)+(c*c));
    }
    public static void isimYas(){
        Scanner scan=new Scanner(System.in);
        System.out.println("bir isim giriniz");
        String ad=scan.nextLine();
        System.out.println("lutfen yaşınızı giriniz");
        int yası= scan.nextInt();

        System.out.println(ad+yası);
    }
}
