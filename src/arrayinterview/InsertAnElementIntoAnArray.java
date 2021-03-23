package arrayinterview;

import java.util.Scanner;


public class InsertAnElementIntoAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length Of The Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter The Elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter The Position Where You Want To Insert ?");
        int m=sc.nextInt();
        System.out.println("Enter The Element :");
        int a=sc.nextInt();
        for(int i=n-1;i>m-1;i--)
        {
            arr[i]=arr[i-1];
        }
        
        arr[m-1]=a;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    
}
