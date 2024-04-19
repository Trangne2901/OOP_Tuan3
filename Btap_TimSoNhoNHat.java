public class Btap_TimSoNhoNHat {
    public static void main(String[] args) {
        int [] array = {2,4,6,8,10};
        int min = array[0];
        for ( int i = 1; i < array.length ; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println("Số nhỏ nhất là :"+min);
    }
}
