import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Nhập cạnh a: ");
                double a = scanner.nextDouble();
                System.out.print("Nhập cạnh b: ");
                double b = scanner.nextDouble();
                System.out.print("Nhập cạnh c: ");
                double c = scanner.nextDouble();

                if (a <= 0 || b <= 0 || c <= 0) {
                    throw new IllegalTriangleException("Các cạnh của tam giác không được là số âm hoặc bằng 0");
                }

                if (a + b <= c || a + c <= b || b + c <= a) {
                    throw new IllegalTriangleException("Tổng hai cạnh của tam giác không lớn hơn cạnh còn lại");
                }

                System.out.println("Tam giác hợp lệ");
            } catch (IllegalTriangleException e) {
                System.err.println("Lỗi: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Lỗi: Nhập không hợp lệ");
            } finally {
                scanner.close();
            }
        }
}