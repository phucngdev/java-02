import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen: ");
        int n = scanner.nextInt();
        if( n % 3 == 0 && n % 5 == 0) {
            System.out.println("chia het");
        } else {
            System.out.println("khong chia het");
        }
    }
}
