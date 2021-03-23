package arrayinterview;
import java.util.Scanner;



public class ElementThatAppearsOnceInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length Of The Array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int res=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            res=res^arr[i];
        }
        System.out.println("Single Element In The Array: "+res);
    }
    
}
