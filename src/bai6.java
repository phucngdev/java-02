import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao nam: ");
        int year = scanner.nextInt();
        System.out.print("Nhap vao thang: ");
        int month = scanner.nextInt();
        boolean isLeap = false;
        if(year % 4 == 0) { //chia hết cho 4 là năm nhuận
            if( year % 100 == 0) { //nếu vừa chia hết cho 4 mà vừa chia hết cho 100 thì không phải năm nhuận
                if ( year % 400 == 0) //chia hết cho 400 là năm nhuận
                    isLeap = true;
                else
                    isLeap = false;//không chia hết cho 400 thì không phải năm nhuận
            }
            else//chia hết cho 4 nhưng không chia hết cho 100 là năm nhuận
                isLeap = true;
        }
        else {
            isLeap = false;
        }
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 nagy");
                break;
            case 2:
                if(isLeap)
                    System.out.println("29 nagy");
                else
                    System.out.println("28 nagy");
                break;
            case 4, 6, 9, 11:
                System.out.println("30 nagy");
                break;
            default:
                System.out.println("khong hop le");
                break;
        }
    }
}
