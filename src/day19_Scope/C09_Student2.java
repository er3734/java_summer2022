package day19_Scope;

public class C09_Student2 {


    public static void main(String[] args) {

     C08_Student ogrenci=new C08_Student();
     C08_Student.okulisim="Yaman kolej";
        System.out.println(C08_Student.okulisim);

     ogrenci.name="mahmut aslan";
     ogrenci.id=23;
     ogrenci.ort=67.8;
     ogrenci.kayıt=true;

        System.out.println(ogrenci.name);
        System.out.println(ogrenci.id);
        System.out.println(ogrenci.ort);
        System.out.println(ogrenci.kayıt);

        System.out.println();

        C08_Student ogrenci2=new C08_Student();
        ogrenci2.name="emre tuncer";
        ogrenci2.id=37;
        ogrenci2.ort=45.6;
        ogrenci2.kayıt=false;

        System.out.println(ogrenci2.name);
        System.out.println(ogrenci2.id);
        System.out.println(ogrenci2.ort);
        System.out.println(ogrenci2.kayıt);



    }
}
