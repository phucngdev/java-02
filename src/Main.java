import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao 1 so nguyen: ");
        int n = scanner.nextInt();
        if(n % 2 == 0) {
            System.out.println("so chan");
        } else {
            System.out.println("so le");
        }
    }
}