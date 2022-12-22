import java.util.Scanner;
class MyException extends Exception
{
    MyException(String s)
    {
        // this(s);
        super(s);
    }
}
class Test extends Exception
{
    Test(int a)
    {
        try {
            if (a < 18) {
                throw new MyException("YOu are not Eligible");
                // System.out.println("YOu are Eligible");
            } else {
                System.out.println("YOu are Eligible");
            }
        }
        catch (MyException e)
        {
            System.err.println(e);
            // System.exit(1);
        }
    }
}
public class Question2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int b=sc.nextInt();
        Test t=new Test(b);
    }
}
