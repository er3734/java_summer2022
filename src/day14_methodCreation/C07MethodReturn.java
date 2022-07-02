package day14_methodCreation;

import java.util.Scanner;

public class C07MethodReturn {
    public static void main(String[] args) {
       int a=3;
       int b=4;
       kuplerFarkı(a,b);
        System.out.println(kuplerFarkı(6,3));
        //System.out.println(kuplerFarkı(3,2));

        String ay=ayAl();
        String mev=ayAl();
        System.out.println(tarih());
        tarih();
    }
    public static String ayAl() {
        String mevsim = null;
        Scanner scan=new Scanner(System.in);
        System.out.println("ayın rakamını giriniz");
        int rkm=scan.nextInt();
        switch (rkm){
            case 1:
            case 2:
            case 12: mevsim="kış";System.out.println(mevsim);break;
            case 3:
            case 4:
            case 5: mevsim="ilkbahar";System.out.println(mevsim);break;
            case 6:
            case 7:
            case 8: mevsim="yaz";System.out.println(mevsim);break;
            case 9:
            case 10:
            case 11: mevsim="sonbahar";System.out.println(mevsim);break;
            default: System.out.println("yanlış giriş");}
        return mevsim;
    }
    public static int kuplerFarkı(int a,int b) {
        int fark=(a*a*a)-(b*b*b);
        return fark;
    }
    public static String tarih(){
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ay ismi giriniz");
        String ayis= scan.nextLine();
        System.out.println("lutfen gunu giriniz");
        int gunr= scan.nextInt();
        //String tar=ayis+gunr;
        return ayis+gunr;

    }

}
