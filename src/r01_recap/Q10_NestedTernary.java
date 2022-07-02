package r01_recap;

public class Q10_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */
    public static void main(String[] args) {
        char finl='A';

        System.out.println(finl=='A'?" gayet basarılı":finl=='B'?"basarılı":finl=='C'?"ha gayrert":"diğerleri");

      //  String finl="a";
        //System.out.println(finl.toUpperCase().equals("A")?"gayet basarılı"
             //   :finl.toUpperCase().equals("B")?"basarılı":finl.toUpperCase().equals("C")?"ha gayret":"diğerleri");
    }

}