package day14_methodCreation;

import day13_MethotCreation.C04_MethodCreation;

public class C02_MethodCreation {

    public static void main(String[] args) {
        //verilen üç bas. bi sayının rakamları top. yazdıran
        // bir methoda yazdırsaklım

        int input=123;
        C04_MethodCreation.topla(6,3);
        C01_MethodCreation.terstenYazdir("erdi");
        rakamlariTopla(input);
    }

    public static void rakamlariTopla(int input) {
        int birler=0;
        int rakamlarTopl=0;
        int temp=input;

        birler=input%10;
        rakamlarTopl+=birler;
        input/=10;

        birler=input%10;
        rakamlarTopl+=birler;
        input/=10;

        birler=input%10;
        rakamlarTopl+=birler;
        input/=10;

        System.out.println(temp + " inputunun rakamlar top : " + rakamlarTopl);
    }
}
