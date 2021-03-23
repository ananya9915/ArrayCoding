
package arrayinterview;

import java.util.Scanner;

public class DeleteAnElementFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Array Length: ");
        int n = sc.nextInt();
        System.out.println("Enter The array elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter The Element :");
        int del_element=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(del_element==arr[i])
            {
                for(int j=i;j<arr.length-1;j++)
                {
                    arr[j]=arr[j+1];
                }
                count=count+1;
                break;
            }
        }
        if(count==0)
        {
            System.out.println("Element Not Found");
            
        }
        else
        {
            System.out.println("Element Deleted Successfully :");
            for(int i=0;i<arr.length-1;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
