import java.util.Arrays;

public class Them_Xoa {

    public static void main(String[] args) {
        //thêm
//        int[] array = {2, 1, 3, 5, 4};
//        int add = 7;
////        array = Arrays.copyOf(array, array.length + 1);
//        int[] newArray = new int[array.length + 1];
//        for (int i = 0; i < newArray.length-1; i++){
//            newArray[i] = array[i];
//        }
//        newArray[newArray.length - 1] = add;
//        for (int i : newArray) {
//            System.out.print(i + " ");
//        }
        //xóa
        int [] arr = {1,2,3,4,5};
        int [] newArray = new int [ arr.length -1];
        for (int i = 0; i < arr.length-1;i++){
            newArray[i]=arr[i+1];
        }
        for ( int i : newArray){
            System.out.print(i+"  ");
        }
//        String [] arr = {"hello mary","hell piter","hello anna"};
//        String [] newArr = new String[arr.length -1];
//        for ( int i = 0 ; i <arr.length; i++ ){
//            newArr[i-1]=arr[i];
//        }
//        for (String i : newArr){
//            System.out.println(i+"  ");
//        }
    }
}
