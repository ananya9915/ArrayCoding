

package arrayinterview;

import java.util.Scanner;



public class ThirdLargestElement {
    public static int thirdLargest(int arr[])
    {
        int n=arr.length;
        if(n<3)
        {
            return 0;
        }
        int first=arr[0];
        for (int i = 0; i < n; i++)
        {
         if(arr[i]>first)
         {
             first=arr[i];
         }
        }
        int second=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) 
        {
            if(arr[i]>second && arr[i]<first)
            {
                second=arr[i];
            }
        }
        int third=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
        {
             if(arr[i]>third && arr[i]<second)
            {
                third=arr[i];
            }
 
        }
        return third;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length Of The Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Third Largest Element Is: "+thirdLargest(arr));
    }
}
