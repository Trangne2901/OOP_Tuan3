import java.util.Scanner;
import java.time.LocalTime;

public class ThucHanh2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalTime time = LocalTime.now ();
        do {
            System.out.println("Nhập:");
            String a = sc.nextLine();
            int gio = time.getHour();
            int phut = time.getMinute();

            switch (a) {
                case "time" :
                    System.out.println(" Bây giờ là : " + gio +":"+phut);
                    break;
                case "exit":
                    System.exit(0);
//                    break;
                    return;
                default:
                    System.out.println("Toi khong hieu");
            }
        }
        while(true);
//        while (true){
//            System.out.print("Mời bạn nhập dữ liệu:");
//            String a = sc.nextLine();
//            int gio = time.getHour();
//            int phut = time.getMinute();
//
//            switch (a){
//                case "time" :
//                    System.out.println("Bây giờ là :" + gio +":" + phut );
//                    break;
//                case "exit":
//                    System.exit(0);
//                    break;
//                default :
//                    System.out.println("Tao không hiểu");
//            }
//        }

    }
}
