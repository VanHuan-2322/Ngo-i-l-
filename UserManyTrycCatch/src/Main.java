import java.util.Scanner;
//Trong đoạn mã lệnh trên có 2 khối catch()
// sự khác nhau về mục đích của các đối tượng trong từng khối catch 1 cái là định dạng 1 cái là ngoại lệ xảy ra khi ném
//99%n là 99 chia cho số nhập vào dư 0 thì là hệ số
//GeeksforGeeks nhập vào sẽ xảy ra ngoại lệ
// số 0 nhập vào cũng sẽ thông báo ngoại lệ
public class Main
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        try
        {
            int n = Integer.parseInt(scn.nextLine());

            if (99%n == 0)
                System.out.println(n + " is a factor of 99");
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Arithmetic " + ex);
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Number Format Exception " + ex);
        }
    }
}
