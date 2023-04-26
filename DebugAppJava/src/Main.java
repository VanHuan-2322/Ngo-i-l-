import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" * Giải phương trình bậc nhất * ");
        System.out.println(" Phương trình có dạng: ax+b=0 ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a");
        double a = scanner.nextDouble();
        System.out.println("Nhập b");
        double b = scanner.nextDouble();
        if (a != 0) {
            if (b != 0) {
                double solution = -b / a;
                System.out.println("Phương trình có nghiệm: " + solution);
            } else {
                System.out.println(" Phương trình vô nghiệm");
            }
        } else if (a == 0 && b == 0) {
            System.out.println("Phương trình có vô số nghiệm");
        }
    }
}