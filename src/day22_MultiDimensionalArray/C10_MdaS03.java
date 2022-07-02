package day22_MultiDimensionalArray;

public class C10_MdaS03 {
    public static void main(String[] args) {
        //Aşağıdaki mutli dimensional array'lerin iç array'lerinde
        // aynı indexe sahip elamanların toplamını yazdıran bir program yazın.
        // arr1[]={{1,2},{3,4,5}{6}}
        // arr2[]={{7,8,9},{10,11},{12}}
        int arr1[][]={{1,2},{3,4,5},{6}};
        int arr2[][]={{7,8,9},{10,11},{12}};
        int top2=0;

       /* int outerUz=0;
        int top=0;
        for (int i = 0; i <arr1.length ; i++) {
            outerUz=arr1[i].length;
            if (arr2[i].length<outerUz){
                outerUz=arr2[i].length;
            }
            for (int j = 0; j <outerUz ; j++) {
                top=arr1[i][j]+arr2[i][j];
                System.out.println(top);
            }
     }*/

        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr1[i].length ; j++) {
                for (int k = 0; k <arr2.length; k++) {
                    for (int l = 0; l <arr2[k].length ; l++) {
                        if (i==k&&j==l){
                            top2=arr1[i][j]+arr2[k][l];
                            System.out.println(top2);
                        }
                    }
                }
            }
        }
    }
}
