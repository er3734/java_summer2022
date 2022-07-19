package praktice07;

public class Q02_MDArray {

    /*
     *  String 2D array olustur
     *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
     *  String de $ varsa 3.2 ile carp
     *  String de € varsa 4.2 ile carp
     *  elemanlarin toplamini double olarak yazdir
     */
    public static void main(String[] args) {
        String arr[][]={{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
        double top=0;
        double a=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j].contains("$")){
                    a=Double.parseDouble(arr[i][j].replace("$",""));
                    top+=a*3.2;
                } else if (arr[i][j].contains("€")) {
                    a=Double.parseDouble(arr[i][j].replace("€",""));
                    top+=a*4.2;
                }

            }
        }
        System.out.println("top = " + top);
    }
}
