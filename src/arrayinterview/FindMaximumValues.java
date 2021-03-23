

package arrayinterview;

import java.util.Scanner;



public class FindMaximumValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length Of The Array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            
        }
        int m=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>m)
            {
                m=arr[i];
            }
        }
        System.out.println(m);
    }
         
}
