package day14_methodCreation;

import day13_MethotCreation.C04_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        //girilen 4 harfli bir stringi  tersten
        // yazdıran bir method yaxdoralım
        terstenYazdir("erdi");
        C04_MethodCreation.topla(2,3);

    }

    public static void terstenYazdir(String input){
        String tersInput=input.substring(3)+
                         input.substring(2,3)+
                         input.substring(1,2)+
                         input.substring(0,1);

        System.out.println("verieln kelimenin tersten yazılışı : " + tersInput);
    }
}
