import java.util.Arrays;
public class Btap_GopMang {
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {4,5,6};


        int add = array1.length + array2.length; // Kích thước mới của mảng gộp

        int[] newArray = new int[add]; // Mảng mới để chứa các phần tử của cả hai mảng

        for (int i = 0 ; i < array1.length ;i++){
            newArray[i]=array1[i];
        }

        for ( int i = 0; i< array2.length;i++){
            newArray[array1.length +i]=array2[i];
        }

        for ( int i : newArray){
            System.out.print( i+"\t");
        }
    }
}
