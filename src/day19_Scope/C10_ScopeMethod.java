package day19_Scope;

public class C10_ScopeMethod {
    static String amarka;
    String tmarka;
    static double amotor;
    double tmodel;

    public static void main(String[] args) {
        System.out.println(amarka);//null
        arabaMarka();//fiat
        System.out.println(amotor);//0.0
        System.out.println(arabaMotor());//2.3
        System.out.println();
        System.out.println("1" +amarka);//mercedes


        C10_ScopeMethod telefon1 =new C10_ScopeMethod();

        System.out.println("1" +telefon1.tmarka);//null
        System.out.println(telefon1.tmarka);//null
        System.out.println(telefon1.tmodel);//0.0
        System.out.println();
        telefon1.telefonMarka();//apple
        System.out.println(telefon1.telefonModel());//13.1
        arabaMarka();//fiat
        arabaMarka();//fiat
        System.out.println(amarka);//mercedes

        C10_ScopeMethod telefon2=new C10_ScopeMethod();
        System.out.println(telefon2.tmarka);//null


    }
    public static void arabaMarka(){
        amarka="Fiat";
        System.out.println(amarka);
        amarka="mercedes";

    }
    public static double arabaMotor(){
        amotor=2.3;
        return amotor;
    }
    public void telefonMarka(){
        tmarka="apple";
        System.out.println(tmarka);

    }
    public double telefonModel(){
        tmodel=13.1;
        return tmodel;
    }
}
