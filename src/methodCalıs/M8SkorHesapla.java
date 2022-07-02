package methodCalıs;

public class M8SkorHesapla {
    public static void skorHesapla(String name,int score){
        System.out.println(name + " isimli oyuncunun puanı : " + score);
    }
    public static void skorHesapla(int score){
        System.out.println("isimsiz oyuncunun puanı : " + score);
    }
    public static void skorHesapla(String name){

        System.out.println(name + " isimli oyuncunun puanı yok");
    }
    public static void main(String[] args) {
        skorHesapla("erdi",3734);
        skorHesapla(3000);
        skorHesapla("fikri");

    }
}
