package day19_Scope;

public class C08_Student {
    String name;
    int id;
    double ort;
    boolean kayıt=false;
    static String okulisim="Kolej";

    public static void main(String[] args) {
        System.out.println(okulisim);
        System.out.println();

        C08_Student ogr1=new C08_Student();

        ogr1.name="Erdi Balta";
        ogr1.id=3734;
        ogr1.ort=97.6;
        ogr1.kayıt=true;

        C08_Student ogr2=new C08_Student();

        ogr2.name="Akın Alkan";
        ogr2.id=3735;
        ogr2.ort=100;
        ogr2.kayıt=false;

        C08_Student ogr3=new C08_Student();

        ogr3.name="Hatice Nur Balbay";
        ogr3.id=3435;
        ogr3.ort=98.0;
        ogr3.kayıt=true;


        System.out.println(ogr1.name);
        System.out.println(ogr1.id);
        System.out.println(ogr1.ort);
        System.out.println(ogr1.kayıt);
        System.out.println();

        System.out.println(ogr2.name);
        System.out.println(ogr2.id);
        System.out.println(ogr2.ort);
        System.out.println(ogr2.kayıt);
        System.out.println();

        System.out.println(ogr3.name);
        System.out.println(ogr3.id);
        System.out.println(ogr3.ort);
        System.out.println(ogr3.kayıt);
    }
}
