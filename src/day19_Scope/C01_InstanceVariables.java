package day19_Scope;

public class C01_InstanceVariables {
               /*
       class içerismde her yerden kullnamk istedğimiz var.ları class levelda
       (classın içinde ama methodalrın dışında)
        genelikle class level var.lar classın başında oluşturulr(şart değil)

        class leveldaki varlar için iki scope vardır
        1-static var.(class var.ları da denir)
        2-instance(static olmayan)var.(obje var.ları denir)
                    */
    int instSayi=20;
    //static olmayıp claas levelda olduğu için instance var.dır


    public static void main(String[] args) {
        int sayi=10;
        /*
        System.out.println(instSayi);
        instance var. static olmadığı içn static
        klube üye main methoddan direk kullanamayız
        instance var.ların diğer adı object var.dır
        dolasıyla obje oluşturusanız instanc evar.ları
        her yerden kullanabiliriz
         */
        C01_InstanceVariables obje1 =new C01_InstanceVariables();
        System.out.println("obje1 değişmeden önce : " +obje1.instSayi);//20
        obje1.instSayi=30;
        System.out.println("obje1 değiştikten sonra : " +obje1.instSayi);//30

        C01_InstanceVariables obje2=new C01_InstanceVariables();
        System.out.println("obje2 değişmeden once : " +obje2.instSayi);//20
        obje2.instSayi=25;
        System.out.println("obje2 değiştikten sonra : " +obje2.instSayi);//25

        C01_InstanceVariables obje3=new C01_InstanceVariables();
        System.out.println("obje3 değişmeden önce : " +obje3.instSayi);
        /*
        her obje oluştuğunda instance yani oblje var.ın
        ilk atanan değerini alır
         */

        C01_InstanceVariables obje5=new C01_InstanceVariables();

        System.out.println("obje5 : "+(obje5.instSayi +20));//40
        System.out.println(obje5.instSayi+ obje2.instSayi+ obje1.instSayi+ obje3.instSayi);//95


    }
    public static void staticMethod(){
        //System.out.println(sayi);
          /*
         bir method'un icerisinde olusturulan variable,
         sadece o method'un icinden kullanilabilir
         (Local variables)
         */

        //instSayi=30; instance var.lara main method dışındaki
        // static methodalardan da ulaşamayız obje oluşturusak ulaşabiliriz
        C01_InstanceVariables obje4=new C01_InstanceVariables();
        System.out.println(obje4.instSayi);//çağırmadığımız için calışmaz

    }
    public void staticOlmayanMethod(){

        System.out.println(instSayi);
        /*
        intance var.lar class içerisindeki static olmayan methodlardan
        direk kullanabilir
         */
    }
}
