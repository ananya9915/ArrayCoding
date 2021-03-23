package arrayinterview;

import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicateElementUsingHashSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length Of The Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp=-1;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=n-1;i>=0;i--)
        {
            if(hs.contains(arr[i]))
            {
                temp=i;
                
                        
            }
            else
            {
                hs.add(arr[i]);
            }
        }
        if(temp!=-1)
        {
            System.out.println("Element Found :"+arr[temp]);
        }
        else
        {
            System.out.println("Not Found :");
        }
    }
}
