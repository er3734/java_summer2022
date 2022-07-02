package day13_MethotCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {

        //input olarak verilen iki int ı topayıp sonucunu yazdıran bir method oluşturun
        //int input1=20;
        //int input2=20;


    //method 4 adımda olurturur
        /*
        1.adım :maethod call
        2.adım argument eklenmsi gerekiyorsa ekleyelim
        eğer met. return type voidden farklıysa bir var. oluş. met. callu assign edelim
         */
        topla(30,40);
    }

    public static void topla(int input1, int input2) {
       /* 3.adım: method declarosyonund değiştirlmesi gerken bölümlerideğişir
                (access mod.,return type)
        4.adım:eğer return ty. void dışında bir şeyse return keywordu
        ve dönecek değeri hesapalamalıyız
        */
        System.out.println("girilen iki sayının top: " + (input1+input2));
    }

}
