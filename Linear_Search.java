import java.util.Scanner;

public class Linear_search {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i=0;i<size;i++)
        {
            System.out.println("Enter elements:");
            a[i] = sc.nextInt();
        }
        System.out.println("Elements are:");
        for (int i=0;i<size;i++)
        {
            System.out.print("\t"+a[i]);
        }
        System.out.println("\nEnter the element to be search:");
        int target = sc.nextInt();
        int ans = linearsearch(a,target);
        if (ans == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + ans);
        }
    }
         
    static int linearsearch(int[] a,int target){
    if(a.length==0)
    {
        return -1;
    }


    for(int index=0;index<a.length;index++)
    {
        int element = a[index];
        if(element == target)
        {
            return index;
        }
    }
    return -1;
    }
}

   
