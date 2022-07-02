package r02_recap;

public class Q01_SwitchCase {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)

*/
    public static void main(String[] args) {

        String gun="pazar";

        switch (gun){
            case "pazartesi":
            case "salı":
                System.out.println("java dersleri gunleri");
                break;
            case "persembe":
            case "cuma":
                System.out.println("selenyum dersleri");
                break;
            case "carşamba":
            case "cumartesi":
                System.out.println("SQl dersi günleri");
                break;
            default:
                System.out.println("izin günü");
        }
    }
}