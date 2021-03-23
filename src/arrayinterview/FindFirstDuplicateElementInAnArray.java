

package arrayinterview;

import java.util.Scanner;


public class FindFirstDuplicateElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length Of The Array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter The Elements :");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int temp=0;
        for (int i = 0; i < n-1; i++) {
            for (int j=i+1; j< n; j++) {
                if(arr[i]==arr[j] && (i!=j))
                {
                    temp=temp+1;
                    System.out.println("First Duplicate :"+arr[i]);
                    break;
                }
            }
            if(temp>0)
            {
                break;
            }
        }
           
    }
    
}
