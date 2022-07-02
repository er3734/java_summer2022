package OOB_1;

public class MainBilgisayar {
    public static void main(String[] args) {
        Bilgisayar bil1=new Bilgisayar();
        bil1.marka="Huawei";
        bil1.islemci="i5";
        bil1.isleciHizi=2.4;
        bil1.ram=8;

        System.out.println(bil1.isleciHizi);
        System.out.println(bil1.ram);
        System.out.println(bil1.islemci);
        System.out.println(bil1.marka);

    }
}
