package day19_Scope;

public class C04_Scope {

    static String okul="kolej";
    String isim ="erdi";



    public static void main(String[] args) {
        System.out.println(okul);
        C04_Scope ogretmen1=new C04_Scope();
        System.out.println(ogretmen1.isim);
        ogretmen1.isim="hatice";
        System.out.println(ogretmen1.isim);
        okul();
        okul();
        C04_Scope ogretmen3=new C04_Scope();
        System.out.println(ogretmen3.isim);
        System.out.println();
        C04_Scope okul1=new C04_Scope();
        okul1.ogretmen();
        System.out.println(okul);


    }
    public static void okul(){
        System.out.println(okul);
        C04_Scope ogretmen2=new C04_Scope();
        System.out.println(ogretmen2.isim);
        ogretmen2.isim="nur";
        System.out.println(ogretmen2.isim);

    }
    public void ogretmen(){
        System.out.println(isim);
        System.out.println(okul);
        okul="devlet";
       isim="fatih";
        System.out.println(isim);
    }
}
