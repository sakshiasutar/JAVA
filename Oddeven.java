import java.util.*;

public class Oddeven{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.close();

    if (n%2==0)
    {
        System.out.println("Number is even");
    }
    else{
        System.out.println("Number is odd");
    }
    }
}
