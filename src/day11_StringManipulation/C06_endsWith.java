package day11_StringManipulation;

public class C06_endsWith {
    public static void main(String[] args) {

        String email="erdi@gmail.com.com";

        if (!email.contains("@gmail.com")){
            System.out.println("lutfen gmail adrtersi giriniz");

        } else if (email.endsWith("@gmail.com")) {
            System.out.println("mail adrsiniz kaydedidi");

        }else {
            System.out.println("yazımı kontrol et");
        }

    }
}
