package day29_passByValue_immutable;

public class C04_Immutable {
    public static void main(String[] args) {
        /*
        Immutable :değiştirilemez
        mutable   :değiştirilebilir

        en meşhur Immutable class String

        */

        String str="Yildiz Bank";
        System.out.println(str.toUpperCase());//YİLDİZ BANK

        str.toLowerCase();
        System.out.println(str);//Yildiz Bank

        str.substring(3,5);//di

        System.out.println(str);//Yildiz Bank

        //java da string gibi metin ifadelerde kullanabileceğimiz
       // mutiable StringBuilder calssı vardır

        StringBuilder sb=new StringBuilder("java bank");
        System.out.println(sb);//java bank
        sb.reverse();

        System.out.println(sb);//knab avaj

        sb.append(".");
        System.out.println(sb);//knab avaj.
    }
}
