import java.util.Scanner;

public class averageCal{
public static void main(String args[])
{
 Scanner scanner=new Scanner(System.in);

 System.out.println("Enter the first Number:");
 double num1=scanner.nextDouble();

 System.out.println("enter the second number:");
 double num2=scanner.nextDouble();

 System.out.println("Enter the third number:");
 double num3=scanner.nextDouble();

 double average=averagecalculater(num1,num2,num3);
 System.out.println("The Average of the three number is:"+ average);

}

public static double averagecalculater(double num1,double num2,double num3){
    return(num1+num2+num3)/3.0;
}
}
