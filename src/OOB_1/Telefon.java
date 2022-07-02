package OOB_1;

public class Telefon {
    private String tmarka;
    private String tmodel;
    private int ram;
    private double islemci;

    public void setTmarka(String tmarka) {
        this.tmarka = tmarka;
    }
    public String getTmarka(){
        return this.tmarka;
    }
    public void setTmodel(String tmodel){
        this.tmodel=tmodel;
    }
    public String getTmodel(){
        return this.tmodel;
    }
    public void setRam(int ram){
        if ( ram>2&&ram<16){
        this.ram=ram;
        }else{
            System.out.println("ram sayısı aralıkta olmalıdır");
        }
    }
    public int getRam(){
        return this.ram;
    }
    public void setIslemci(double islemci){
        this.islemci=islemci;
    }
    public double getIslemci(){
        return this.islemci;
    }
    public void alındı(){
        System.out.println("telefon alındı");
    }
    public void satıldı(){
        System.out.println("telefon satıldı");
    }
}
