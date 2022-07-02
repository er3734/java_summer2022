package OOB_1;

public class Main {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.setColar("gümüş");
        car1.setModel("megane");
        car1.setDoors(1);
        car1.setEngine(1.4);

        System.out.println("rengi : " + car1.getColor());
        System.out.println(car1.getModel());
        System.out.println(car1.getDoors());
        System.out.println(car1.getEngine());
        car1.start();
        car1.stop();

        Car car2=new Car();
        car2.setColar("mavi");
        car2.setModel("clio");
        car2.setDoors(4);
        car2.setEngine(1.8);

        System.out.println("car2.getColor() = " + car2.getColor());
        System.out.println("car2.getModel() = " + car2.getModel());
        System.out.println("car2.getDoors() = " + car2.getDoors());
        System.out.println("car2.getEngine() = " + car2.getEngine());
        car1.stop();
        car1.start();


       /* car classı public olursa
        Car car1=new Car();
        car1.color="mavi";
        car1.model="reno";
        car1.engine=1.6;
        car1.doors=4;
        System.out.println("car1.color = " + car1.color);
        System.out.println("car1.model = " + car1.model);
        System.out.println("car1.enginie = " + car1.engine);
        System.out.println("car1.doors = " + car1.doors);
        
        Car car2=new Car();
        car2.doors=2;
        car2.color="beyaz";
        car2.model="megane";
        car2.engine=1.2;
        System.out.println("car2.doors = " + car2.doors);
        System.out.println("car2.model = " + car2.model);
        System.out.println("car2.color = " + car2.color);
        System.out.println("car2.engine = " + car2.engine);*/
    }
}
