// A Class that represents use-defined exception

class MyException extends Exception {
    public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}

// A Class that uses above MyException
public class Main {
    // Driver Program
    public static void main(String args[])
    {
        try {
            // Throw an object of user defined exception
            throw new MyException("GeeksGeeks");
        }
        catch (MyException ex) {
            System.out.println("Caught");

            // Print the message from MyException object
            System.out.println(ex.getMessage());
        }
    }
}


//Bước 1: Đoạn mã trên định nghĩa một lớp MyException kế thừa từ lớp Exception
// để định nghĩa một ngoại lệ do người dùng xác định. Lớp MyException có một hàm khởi tạo
// nhận vào một chuỗi thông báo và gọi hàm khởi tạo của lớp cha Exception.
// Sau đó, đoạn mã sử dụng lớp MyException để tạo một đối tượng ngoại lệ và bắn nó,
// rồi sử dụng câu lệnh try-catch để xử lý ngoại lệ đó.
//
//Bước 2: Đoạn mã trên gồm 2 lớp: MyException và Main. Lớp MyException định nghĩa một ngoại lệ
// do người dùng xác định, trong khi lớp Main chứa phương thức main()
// là phương thức khởi động của chương trình.
//
//Bước 3: Khi thực thi đoạn mã trên, chương trình sẽ tạo một đối tượng ngoại lệ MyException
// với thông báo "GeeksGeeks" và bắn nó bằng câu lệnh throw. Sau đó, câu lệnh catch bắt ngoại lệ
// này và in ra màn hình thông báo "Caught" cùng với thông báo từ đối tượng ngoại lệ MyException
// được truyền vào trong phương thức khởi tạo. Do đó, kết quả sẽ là "Caught" và "GeeksGeeks".