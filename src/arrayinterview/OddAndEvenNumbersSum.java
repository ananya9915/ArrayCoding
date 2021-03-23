package arrayinterview;

import java.util.ArrayList;
import java.util.Scanner;

public class OddAndEvenNumbersSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length Of The Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr1.add(arr[i]);
            } else {
                arr2.add(arr[i]);
            }
        }

        int oddSum = 0;
        
        for (int k : arr1) {
            oddSum += k;
            
        }
        int evenSum = 0;
        
        for (int j : arr2) {
            evenSum += j;
            
        }
        
        System.out.println("Total Odd Numbers Are: " + arr1.size());
        System.out.println("Total Even Numbers Are: " + arr2.size());
        System.out.println("Sum of all the odd numbers is: " + oddSum);
        System.out.println("Sum of all the even numbers is: " + evenSum);
    }
}
