public class ThucHanh1 {
    public static void main(String[] args) {

//        String[] seasons ={"Winter", "Spring", "Summer", "Autumn"};
//        for (int i = 0; i<4; i++) {
//            System.out.println(seasons[i]);
//        }
//        int [] so = {1,2,3,4,5,6};
//        for (int j = 0; j <5; j++){
//            System.out.println( so [j]);
//        }

        String seasons[][] = {
                {"Winter", "Spring", "Summer", "Autumn"},
                {"Hello Piter", "Hello Mery ", "Hello Anna"}
        };
//            System.out.println("Mùa :" + seasons[0][3]);
//        System.out.println(seasons[1][2] +"." + " How are you?");
        for (int i = 0; i < seasons.length; ++i) {
            for (int j = 0; j < seasons[i].length; ++j) {
                System.out.println(seasons[i][j]);
            }
        }
    }
}
