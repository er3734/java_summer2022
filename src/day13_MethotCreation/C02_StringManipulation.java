package day13_MethotCreation;

public class C02_StringManipulation {
    public static void main(String[] args) {

        String sifre="Deli123java";
        int kontrol=0;
        if (sifre.charAt(0)>='A'&&sifre.charAt(0)<='Z'){
            kontrol++;
        }else {
            System.out.println("ilk harf buyuk olmalı");
        }
        if (sifre.charAt(sifre.length()-1)>='a'&&sifre.charAt(sifre.length()-1)<='z'){
          kontrol++;
        }else {
            System.out.println("son harf buyuk olmalı");
        }
        if (sifre.contains(" ")){
            System.out.println("sifre bosluk içermemli");
        }else {
            kontrol++;
        }
        if (sifre.length()>=8){
            kontrol++;
        }else {
            System.out.println("sifre en az sekiz karekter olmalı");
        }

        if (kontrol==4){
            System.out.println("sifre basarı ile tanımlandı");
        }else{
            System.out.println("işlem başarısız");}
    }
}
