import java.util.Scanner;
//Trong đoạn mã lệnh trên có 1 khối catch()
// sự khác nhau về mục đích của các đối tượng trong khối catch gộp 1 cái là định dạng và 1 cái là ngoại lệ xảy ra khi ném
//99%n là 99 chia cho số nhập vào dư 0 thì là hệ số
public class Test
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
        catch (NumberFormatException | ArithmeticException ex)
        {
            System.out.println("Exception encountered " + ex);
        }
    }
}
