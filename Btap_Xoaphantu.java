import java.util.Arrays;

public class Btap_Xoaphantu {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
//        int index = 3;
//        for (int i = index; i < array.length - 1; i++) {
//            array[i] = array[i + 1];
//        }
//        array = Arrays.copyOf(array, array.length - 1);
//        for (int i : array) {
//            System.out.println(i + " ");
//        }

        //xóa

        int [] newArray = new int [ array.length -1];
        for (int i = 0; i < array.length-1;i++){
            newArray[i]=array[i+1];
        }

//        newArray[newArray.length - 1]=index;
        for ( int i : newArray){
            System.out.print(i+"  ");
        }

    }
}
