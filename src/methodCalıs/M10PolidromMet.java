package methodCalıs;

public class M10PolidromMet {
    static boolean isPolindrom(int input){
        int temp,tersSayi=0,kalan;
        temp=input;

        while(temp!=0){
            kalan=temp%10;
            tersSayi=tersSayi*10+kalan;
            temp/=10;
            System.out.println(tersSayi);
        }
        if(input==tersSayi)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(isPolindrom(323));

    }
}
