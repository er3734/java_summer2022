package day19_Scope;

import day17_nestedForLoop.C10;

public class C11_ScopeMethod {

    public static void main(String[] args) {
        System.out.println(C10_ScopeMethod.amarka);//null
        C10_ScopeMethod.arabaMarka();//fiat
        System.out.println(C10_ScopeMethod.amarka);//mercedes
        System.out.println(C10_ScopeMethod.arabaMotor());//2.3
        System.out.println(C10_ScopeMethod.amotor);//2.3
        System.out.println();

        C10_ScopeMethod tel=new C10_ScopeMethod();
        System.out.println(tel.tmarka);//null
        tel.telefonMarka();//apple
        System.out.println(tel.tmodel);//0.0
        System.out.println(tel.telefonModel());//13.1
        System.out.println(tel.tmodel);
        tel.tmarka="sony";
        System.out.println(tel.tmarka);//sony
        tel.telefonMarka();//apple

    }
}
