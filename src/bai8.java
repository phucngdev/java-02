import java.util.Scanner;
import java.time.LocalDate;
public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao ngay: ");
        int day = scanner.nextInt();
        System.out.print("Nhap vao thang: ");
        int month = scanner.nextInt();
        System.out.print("Nhap vao nam: ");
        int year = scanner.nextInt();
        LocalDate dateNow = LocalDate.now();
        int yearNow = dateNow.getYear();
        boolean isLeap = false;
        if(yearNow < year) {
            System.out.println("Ngay thang nam sai");
        }
        if(year % 4 == 0) {
            if( year % 100 == 0) {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                if(day > 0 && day <= 31) {
                    System.out.printf("%d %d %d ",day , month, year );
                    System.out.println("Ngay thang nam dung");
                } else {
                    System.out.println("Ngay thang nam sai");
                }
                break;
            case 2:
                if(isLeap)
                    if(day > 0 && day <= 29) {
                        System.out.printf("%d %d %d ",day , month, year );
                        System.out.println("Ngay thang nam dung");
                    } else {
                        System.out.println("Ngay thang nam sai");
                    }
                else
                    if(day > 0 && day <= 28) {
                        System.out.printf("%d %d %d ",day , month, year );
                        System.out.println("Ngay thang nam dung");
                    } else {
                        System.out.println("Ngay thang nam sai");
                    }
                break;
            case 4, 6, 9, 11:
                if(day > 0 && day <= 30) {
                    System.out.printf("%d %d %d ",day , month, year );
                    System.out.println("Ngay thang nam dung");
                } else {
                    System.out.println("Ngay thang nam sai");
                }
                break;
            default:
                System.out.println("khong hop le");
                break;
        }
    }
}
