import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen thu 1: ");
        int n = scanner.nextInt();
        System.out.print("Nhap vao so nguyen thu 2");
        int m = scanner.nextInt();
        System.out.print("Nhap vao phep tinh + - * / : ");
        char op = scanner.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(n + m);
                break;
            case '-':
                System.out.println(n - m);
                break;
            case '*':
                System.out.println(n * m);
                break;
            case '/':
                System.out.println(n / m);
                break;
            default:
                System.out.println("khong hop le");
                break;
        }
    }
}
