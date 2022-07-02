package replitSorular;

public class S22 {
    public static void main(String[] args) {

        String ay="şubat".toLowerCase();
        int yıl=2020;

        if (yıl%4==0){
            switch (ay){
                case "ocak":System.out.println(ay + yıl + " 31 gundur");break;
                case "mart":System.out.println(ay + yıl + " 31 gundur");break;
                case "mayıs":System.out.println(ay + yıl + " 31 gundur");break;
                case "haziran":System.out.println(ay + yıl + " 31 gundur");break;
                case "temmuz":System.out.println(ay + yıl + " 31 gundur");break;
                case "ağustos":System.out.println(ay + yıl + " 31 gundur");break;
                case "ekim":System.out.println(ay + yıl + " 31 gundur");break;
                case "aralık":System.out.println(ay + yıl + " 31 gundur");break;
                case "nisan":System.out.println(ay + yıl + " 30 gundur");break;
                case "eylül":System.out.println(ay + yıl + " 30 gundur");break;
                case "kasım":System.out.println(ay + yıl + " 30 gundur");break;
                case "şubat":System.out.println(ay + yıl + " 29 gundur");break;
                default:
            }
        }else {
            switch (ay) {
                case "ocak":System.out.println(ay + yıl + " 31 gundur");break;
                case "mart":System.out.println(ay + yıl + " 31 gundur");break;
                case "mayıs":System.out.println(ay + yıl + " 31 gundur");break;
                case "haziran":System.out.println(ay + yıl + " 31 gundur");break;
                case "temmuz":System.out.println(ay + yıl + " 31 gundur");break;
                case "ağustos":System.out.println(ay + yıl + " 31 gundur");break;
                case "ekim":System.out.println(ay + yıl + " 31 gundur");break;
                case "aralık":System.out.println(ay + yıl + " 31 gundur");break;
                case "nisan":System.out.println(ay + yıl + " 30 gundur");break;
                case "eylül":System.out.println(ay + yıl + " 30 gundur");break;
                case "kasım":System.out.println(ay + yıl + " 30 gundur");break;
                case "şubat":System.out.println(ay + yıl + " 28 gundur");break;
                default:
            }
        }
    }
}
