import java.util.Random;
// tạo lớp ArrayExample
// Mảng Integer vs phường thức createRandom trả về số nguyên ngẫu nhiên từ 0 đến 100
//Sử dụng vòng lặp for khi chạy xg thì return lại mảng
public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }

}
