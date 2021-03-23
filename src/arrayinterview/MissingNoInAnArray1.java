

package arrayinterview;

import static arrayinterview.KadaneAlgorithmForMaximumSum.maximumSum;
import java.util.Scanner;


public class MissingNoInAnArray1 {
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
        int no_of_elements = n+1;
        int total_sum = no_of_elements*(no_of_elements+1)/2;
         System.out.println(total_sum);
         int sum=0;
         for (int i = 0; i < n; i++) {
             sum+=arr[i];
         }
         System.out.println("Missing Number :"+ (total_sum-sum));
                
    }
}
