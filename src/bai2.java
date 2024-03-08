import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float html, css, javascript;
        System.out.print("Nhap vao diem html: ");
        html = scanner.nextFloat();
        System.out.print("Nhap vao diem css: ");
        css = scanner.nextFloat();
        System.out.print("Nhap vao diem javascript: ");
        javascript = scanner.nextFloat();
        float avgMark = (html + css + javascript) / 3;
        if(avgMark >= 0 && avgMark < 5) {
            System.out.println("yeu");
        } else if(avgMark >= 5 && avgMark < 7) {
            System.out.println("trung bình");
        } else if(avgMark >= 7 && avgMark < 8) {
            System.out.println("kha");
        } else if(avgMark >= 8 && avgMark < 9) {
            System.out.println("gioi");
        } else {
            System.out.println("xuat sac");
        }
    }
}
