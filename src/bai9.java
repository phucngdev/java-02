import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        System.out.print("Nhap vao so 1: ");
        a = sc.nextFloat();
        System.out.print("Nhap vao so 2: ");
        b = sc.nextFloat();
        System.out.print("Nhap vao so 3: ");
        c = sc.nextFloat();
        if (a < b) {
            if(b < c) {
                System.out.printf("thu tu giam dan %.0f %.0f %.0f", c, b, a);
            } else {
                System.out.printf("thu tu giam dan %.0f %.0f %.0f", b, c, a);
            }
        } else {
            if(b > c) {
                System.out.printf("thu tu giam dan %.0f %.0f %.0f", a, b, c);
            }  else {
                System.out.printf("thu tu giam dan %.0f %.0f %.0f", a, c, b);
            }
        }

    }
}
