import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao lương co ban: ");
        float lcb = scanner.nextFloat();
        System.out.print("Nhap vao cong thuc te: ");
        int n = scanner.nextInt();
        float slr = lcb * (n / 26);

    }
}
