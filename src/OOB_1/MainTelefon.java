package OOB_1;

public class MainTelefon {
    public static void main(String[] args) {
        Telefon tel1=new Telefon();
        tel1.setTmarka("sony");
        tel1.setTmodel("p30 lite");
        tel1.setIslemci(2.4);
        tel1.setRam(18);


        System.out.println("tel marka " +tel1.getTmarka());
        System.out.println("tel model " +tel1.getTmodel());
        System.out.println("tel işlemci " + tel1.getIslemci());
        System.out.println("tel ram " +tel1.getRam());
        tel1.alındı();
        tel1.satıldı();
    }
}
