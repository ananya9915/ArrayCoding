package arrayinterview;

import java.util.Scanner;

public class AllPairsOfElementsWhoseSumIsAGivenNumber {
    public static void findPair(int arr[],int n)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==n)
                {
                    System.out.print(arr[i]+"+"+arr[j]+"="+n);
                    System.out.println("");
                }
                    
            }
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
        System.out.println("Enter The Element:");
        int m=sc.nextInt();
        findPair(arr,m);
    }
    
}
