package day22_MultiDimensionalArray;

public class C11_MdaİciceCarpım {
    public static void main(String[] args) {
        //Aşağıdaki mutli dimensional array'lerin iç array'lerinde
        // aynı indexe sahip elamanların carpımını yazdıran bir program yazın.
        // arr1[]={{1,2},{3,4,5}{6}}
        // arr2[]={{7,8,9},{10,11},{12}}
        int arr1[][]={{1,2},{3,4,5},{6}};
        int arr2[][]={{7,8,9},{10,11},{12}};

        int carpim=1;
       /* int sinir=0;

        for (int i = 0; i <arr1.length ; i++) {
            sinir=arr1[i].length;
            if (arr1[i].length>arr2[i].length){
                sinir=arr2[i].length;
            }
            for (int j = 0; j <sinir ; j++) {
                carpim=arr1[i][j]*arr2[i][j];
                System.out.println(carpim);

            }
        }*/

        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr1[i].length ; j++) {
                for (int k = 0; k <arr2.length ; k++) {
                    for (int l = 0; l <arr2[k].length ; l++) {
                        if (i==k&&j==l){
                            carpim=arr1[i][j]*arr2[k][l];
                            System.out.println(carpim);
                        }

                    }

                }

            }

        }
    }
}
