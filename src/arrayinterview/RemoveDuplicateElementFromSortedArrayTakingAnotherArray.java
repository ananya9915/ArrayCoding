
package arrayinterview;

import java.util.Scanner;

public class RemoveDuplicateElementFromSortedArrayTakingAnotherArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Array Length: ");
        int n = sc.nextInt();
        System.out.println("Enter The array elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] temp=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                temp[j]=arr[i];
                j++;
            }
        }
        temp[j]=arr[arr.length-1];
        System.out.println(".................");
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]==0)
            {
                break;
            }
            System.out.print(temp[i]+" ");
        }
    }
}
