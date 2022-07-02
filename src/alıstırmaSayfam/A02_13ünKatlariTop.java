package alıstırmaSayfam;

public class A02_13ünKatlariTop {
    public static void main(String[] args) {
        int t=0;
         for(int i=100;i>0;i--){

             if(i%13==0){
                 System.out.println(i);
                 t+=i;

             }
         }
        System.out.println(t);
    }
}
