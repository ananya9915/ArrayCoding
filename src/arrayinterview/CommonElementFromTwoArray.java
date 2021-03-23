

package arrayinterview;

import java.util.HashSet;
import java.util.Scanner;



public class CommonElementFromTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length Of The Array: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
         System.out.println("Enter The Elements :");
        for (int i = 0; i < n; i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter The Length Of The Array: ");
        int m = sc.nextInt();
        int arr2[] = new int[m];
         System.out.println("Enter The Elements :");
        for (int i = 0; i < m; i++)
        {
            arr2[i] = sc.nextInt();
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int no:arr1)
        {
            hs.add(no);
        }
        for(int no:arr2)
        {
            boolean b=hs.add(no);
            if(b==false)
            {
                System.out.println("Common Elements :"+ no);
            }
        }
        
}
}
