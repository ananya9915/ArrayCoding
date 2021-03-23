
package arrayinterview;

import java.util.Scanner;

public class DeleteTheElementAndReplaceItWithZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);System.out.print("Enter The Array Length: ");
        int n = sc.nextInt();
        System.out.println("Enter The array elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter The Elements Which You Want To Delete :");
        int del_ele=sc.nextInt();
     
        for(int j=0;j<n;j++)
        {
            if(arr[j]==del_ele)
            {
                arr[j]=0;
            }
        }
        for(int c:arr)
        System.out.print(c+" ");
                
    }
}
