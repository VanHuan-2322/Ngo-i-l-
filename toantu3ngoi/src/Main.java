public class Main {
//  Đầu tiên, biến str được khởi tạo với giá trị null.
//
//Tiếp theo, biến message được khởi tạo bằng cách sử dụng toán tử 3 ngôi:
// nếu giá trị của str là null, thì message sẽ được khởi tạo với giá trị "" (chuỗi rỗng),
// ngược lại message sẽ được khởi tạo bằng phần tử từ vị trí đầu tiên đến vị trí thứ 5 của chuỗi str
// bằng phương thức substring().
//
//Sau đó, biến str được gán giá trị "Geeksforgeeks".
//
//Cuối cùng, biến message được khởi tạo lại bằng cách sử dụng toán tử 3 ngôi
// và lấy phần tử từ vị trí đầu tiên đến vị trí thứ 5 của chuỗi str. Giá trị của message sẽ là "Geeks".
    public static void main(String[] args){
        // Initializing String variable with null value
//    String str = null;
//    String message = (str == null) ? "" :
//            str.substring(0,5);
//        System.out.println(message);
//
//    // Initializing String variable with null value
//    str = "Geeksforgeeks";
//    message = (str == null) ? "" : str.substring(0,5);
//        System.out.println(message);



//          cp tổng quát: condition ? value_if_true : value_if_false
//condition là điều kiện để kiểm tra.
//value_if_true là giá trị trả về nếu điều kiện là đúng.
//value_if_false là giá trị trả về nếu điều kiện là sai.

        int number = -5;
        String result = (number > 0) ? "Positive" : "Negative";
        System.out.println(result); // Output: Negative
}

}