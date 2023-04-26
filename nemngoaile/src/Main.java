public class Main {

//Lệnh "throw" được sử dụng để ném một ngoại lệ từ phương thức hiện tại đến phương thức được gọi và ném lại ngoại lệ (rethrow) đó cho phương thức khác xử lý tiếp.

//Lệnh "throw new NullPointerException("demo");" được sử dụng để tạo ra một ngoại lệ NullPointerException với thông báo "demo". Ngoại lệ này sẽ được ném (throw) ra khỏi phương thức hiện tại và được bắt (catch) bởi khối try-catch trong phương thức gọi.

//Lệnh "throw e;" được sử dụng để tái sử dụng (rethrow) một ngoại lệ đã được bắt (catch) trong khối catch hiện tại. Trong đoạn mã này, ngoại lệ được tái sử dụng (rethrow) để nó được bắt (catch) trong khối catch của phương thức gọi.

//Kết quả in ra sẽ là "Caught inside fun()." và "Caught in main()." Do ngoại lệ NullPointerException được ném (throw) bởi phương thức fun() và được bắt (catch) trong khối catch của phương thức gọi main(). Sau đó, ngoại lệ này được tái sử dụng (rethrow) bởi phương thức fun() và lại được bắt (catch) trong khối catch của phương thức gọi main().
     public static class ThrowExcep
    {
        static void fun()
        {
            try
            {
                throw new NullPointerException("demo");
            }
            catch(NullPointerException e)
            {
                System.out.println("Caught inside fun().");
                throw e; // rethrowing the exception
            }
        }

        public static void main(String args[])
        {
            try
            {
                fun();
            }
            catch(NullPointerException e)
            {
                System.out.println("Caught in main.");
            }
        }
    }

}