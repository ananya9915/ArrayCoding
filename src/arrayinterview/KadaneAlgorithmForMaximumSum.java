

package arrayinterview;

import java.util.Scanner;



public class KadaneAlgorithmForMaximumSum {
    public static int maximumSum(int arr[])
            {
                int csum=arr[0];
                int osum=arr[0];
                for(int i=0;i<arr.length;i++)
                {
                    if(csum>=0)
                    {
                        csum+=arr[i];
                    }
                    else
                    {
                        csum=arr[i];
                    }
                    if(csum>osum)
                    {
                        osum=csum;
                    }
                }
                return osum;
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
        System.out.println( maximumSum(arr));
    }
        
    
}
