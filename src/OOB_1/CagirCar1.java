package OOB_1;

public class CagirCar1 {
    public static void main(String[] args) {


        Car1 araba1 = new Car1();
        
        araba1.ilanNo=1234;
        araba1.marka="toyata";
        araba1.model="auris";
        araba1.fiyat=130000;
        araba1.yil=2011;

        System.out.println(araba1.ilanNo+","+araba1.marka+","+araba1.model+","+araba1.fiyat+","+araba1.yil);;

        araba1.yakit("dizel");
        araba1.hiz(300);

    }
}
