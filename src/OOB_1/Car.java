package OOB_1;

public class Car {
    //fields
    private String color;
    private String model;
    private double engine;
    private int doors;

    public void setColar(String colar ){
        this.color=colar;
    }
    public String getColor(){
        return this.color;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return this.model;
    }
    public void setEngine(double engine){
        this.engine=engine;
    }
    public double getEngine(){
        return this.engine;
    }
    public void setDoors(int doors){
        if (doors==2||doors==4){
            this.doors=doors;
        }else {
            System.out.println("yanlışkapı sayısı");
        }
    }
    public int getDoors(){
        return this.doors;
    }
    public void start(){
        System.out.println("araba calıştı");
    }
    public void stop(){
        System.out.println("araba durdu");
    }
}
