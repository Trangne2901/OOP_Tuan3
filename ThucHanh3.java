public class ThucHanh3 {
    public static void main(String[] args) {

        int [] mang = {1,3,5,7,8,23};
        int max = mang[0];

        for ( int i = 1; i < mang.length ; i++){
            if (max < mang[i]){
                max = mang[i];
            }
        }
//        for ( int i : mang ){
//            if (i>max){
//                max = i;
//
//            }
//        }
        System.out.println("Số lớn nhất " + max);
    }
}
