public class Main {
// Bước 2: Mục đích của hàm getLength() là trả về độ dài của chuỗi được truyền vào.
// Nếu chuỗi là null, nó sẽ ném một ngoại lệ IllegalArgumentException.
//
//Bước 3: Chương trình sẽ in ra các kết quả sau đây:
//
//The argument cannot be null
//13
//The argument cannot be null
//
//Bước 4: Ngoại lệ IllegalArgumentException xảy ra khi một phương thức được gọi với một đối số không hợp lệ.
// Trong trường hợp này, nó được ném ra khi chuỗi truyền vào cho hàm getLength() là null.
        public static void main(String[] args) {
            // String s set an empty string  and calling getLength()
            String s = "";
            try {
                System.out.println(getLength(s));
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException caught");
            }

            // String s set to a value and calling getLength()
            s = "GeeksforGeeks";
            try {
                System.out.println(getLength(s));
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException caught");
            }

            // Setting s as null and calling getLength()
            s = null;
            try {
                System.out.println(getLength(s));
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException caught");
            }
        }

        // Function to return length of string s. It throws
        // IllegalArgumentException if s is null.
        public static int getLength(String s) {
            if (s == null)
                throw new IllegalArgumentException("The argument cannot be null");
            return s.length();
        }
}