public class Btap_SoLonNhatMang2c {
    public static void main(String[] args) {
        int [][] arr1 = {
                {1,2,3},
                {4,5,6},
        };
        int max = arr1[0][0];
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j< arr1[i].length ; j++){
                if (max < arr1[i][j]) {
                    max = arr1[i][j];
                }
                }
            }
            System.out.println("Số lớn nhất là:" + max);
        }
    }
