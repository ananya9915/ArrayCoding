

package arrayinterview;

import java.util.Scanner;


public class RemoveDuplicateElementFromArrayWithouTakingAnotherArray {
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
        int j=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[j]=arr[i];
                j++;
            }
        }
        System.out.println("............................");
        arr[j]=arr[arr.length-1];
        for(int i=0;i<j+1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
