

package arrayinterview;

import java.util.Scanner;



public class MissingNumberInAnUnsortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length Of The Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
         System.out.println("Enter The Elements :");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int i,total;
        total = (n+1)*(n+2)/2;
        for( i=0;i<n;i++)
        {
            total-=arr[i];
        }
        System.out.println(total);
}
}
