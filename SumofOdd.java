import java.util.Scanner;
public class SumofOdd{
    public static int sum_odd(int n)
    {
        int total = 0;
        for(int num=1;num<=n;num++)
        {
            if(num%2!=0)
            {
                total += num;
            }
        }
        return total;
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Total nos to add");
        int n=scanner.nextInt();

        int result = sum_odd(n);
        System.out.println("Sum of all odd no from 1 to "+n+":"+result);
    }
}
