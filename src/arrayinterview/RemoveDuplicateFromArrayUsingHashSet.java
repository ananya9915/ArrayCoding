
package arrayinterview;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class RemoveDuplicateFromArrayUsingHashSet {
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
        HashSet<Integer> hs=new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
            
        }
        for(int no:hs)
        {
            System.out.println(no);
                
        }
    }
    
}
