import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Nhap vao canh 1: ");
        a = sc.nextInt();
        System.out.print("Nhap vao canh 2: ");
        b = sc.nextInt();
        System.out.print("Nhap vao canh 3: ");
        c = sc.nextInt();
        if(a + b > c) {
            if( a == b && a == c && b == c) {
                System.out.println("Tam giac deu");
            } else if( a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
                if( a == b || a == c || b == c) {
                    System.out.println("tam giac vuong can");
                } else {
                    System.out.println("tam giac vuong");
                }
            } else if(a == b || a == c || b == c) {
                System.out.println("tam giac can");
            } else {
                System.out.println("tam giac thuong");
            }
        } else {
            System.out.println("khong p tam giac");
        }
    }
}
