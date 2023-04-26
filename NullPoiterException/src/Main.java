public class Main {
//    Bước 1: Khi chạy đoạn mã lệnh trên, một NullPointerException sẽ được ném ra.
//    Điều này xảy ra vì biến ptr được khởi tạo với giá trị null, và phép so sánh ptr.equals("gfg")
//    sẽ thực hiện trên một tham chiếu đối tượng null, không thể thực hiện phép so sánh này.
//
//Bước 2: Sau khi sửa đổi đoạn mã, nó sẽ xử lý ngoại lệ bằng cách sử dụng một khối try-catch.
// Khi chạy, nó sẽ bắt NullPointerException được ném ra khi thực hiện phép so sánh ptr.equals("gfg").
//
//Bước 3: NullPointerException là một loại ngoại lệ trong Java xảy ra khi một tham chiếu đối tượng null được
// sử dụng trong một phép toán yêu cầu đối tượng thực sự. Ví dụ: gọi một phương thức trên một tham chiếu null
// hoặc thực hiện phép so sánh trên một tham chiếu null.
//
//Bước 4: Sau khi chỉnh sửa, đoạn mã lệnh sẽ in ra kết quả "Not Same".
// Điều này xảy ra vì thay vì kiểm tra xem ptr.equals("gfg"), nó kiểm tra xem "gfg".equals(ptr).
// Đây là cách thường được sử dụng để kiểm tra một chuỗi null, vì phương thức equals của đối tượng chuỗi
// trong Java sẽ trả về false nếu đối tượng chuỗi so sánh là null. Tương tự, nếu ptr là null,
// nó sẽ trả về false và in ra "Not Same". Nếu có ngoại lệ xảy ra, khối catch sẽ bắt và
// in ra "Caught NullPointerException".
    public static void main (String[] args)
    {
//        String ptr = null;
////
////        if (ptr.equals("gfg"))
////            System.out.print("Same");
////        else
////            System.out.print("Not Same");


//        // Initializing String variable with null value
//        String ptr = null;
//
//        // Checking if ptr.equals null or works fine.
//        try
//        {
//            // This line of code throws NullPointerException
//            // because ptr is null
//            if (ptr.equals("gfg"))
//                System.out.print("Same");
//            else
//                System.out.print("Not Same");
//        }
//        catch(NullPointerException e)
//        {
//            System.out.print("NullPointerException Caught");
//        }


        // Initializing String variable with null value
        String ptr = null;

        // Checking if ptr is null using try catch.
        try
        {
            if ("gfg".equals(ptr))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("Caught NullPointerException");
        }
   }

}

