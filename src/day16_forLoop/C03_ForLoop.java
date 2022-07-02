package day16_forLoop;

public class C03_ForLoop {
    // Soru2: 10 ile 30 arasindaki(10 ve 30 dahil) sayilari aralarinda
//  virgul olarak ayni satira yaziniz

    public static void main(String[] args) {

        int bas=20;
        int son=35;
        for (int i = bas; i <=son ; i++) {
            if (i<son){
                System.out.print(i+",");
            }else {
                System.out.print(i);
            }
        }
    }
}
