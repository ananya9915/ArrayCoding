package arrayinterview;

import java.util.Scanner;

public class MoveAllNegativeNumberssToStartOfTheArray {
    public static void rearrange(int arr[],int arr1[])
    {
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                arr1[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                arr1[j]=arr[i];
                j++;
            }
        }
        for(int no:arr1)
        {
            System.out.println(no);
        }
    }
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length Of The Array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter The Elements :");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            
        }
        int newarray[]=new int[n];
        rearrange(arr, newarray);
}
}