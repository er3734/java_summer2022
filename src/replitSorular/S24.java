package replitSorular;

public class S24 {
    public static void main(String[] args) {
        String isim1="mehmet";
        String isim2="ahmet";


        if (isim1.length()%2==0){
            System.out.println(isim1.substring(0,(isim1.length()/2)).concat(isim2)
                    .concat(isim1.substring((isim1.length()/2),(isim1.length()))));
        }else {
            System.out.println("isim1 isim2 ye eklenemiyor");
        }
    }
}
