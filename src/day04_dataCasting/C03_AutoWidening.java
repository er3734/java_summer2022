package day04_dataCasting;

public class C03_AutoWidening {
    public static void main(String[] args) {

        byte say1=23;
        short say2=55;
        int say3=say1+say2;//88

        double say4=say1*say2;//1265.0

       // say4=say2/say1;
        System.out.println(say4);//önce işlemi yaptığı için 2.39 yerine 2.0 yazdırır
        //veri kaybı olur engellemek için data casting yapılır

        say4=(double) say2/say1;
        System.out.println(say4);//data casting yaptığımız için 2.3913.. cıkar



    }
}
