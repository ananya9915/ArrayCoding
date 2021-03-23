package arrayinterview;

import java.util.Scanner;

public class MergeTwoArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length Of The Array: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter The Elements :");

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();

        }
        System.out.println("Enter The Length Of The Array: ");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        System.out.println("Enter The Elements :");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();

        }
        int c = n + m;
        int[] arr3 = new int[c];
        System.out.println(".............................");
        for (int i = 0; i < n; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < m; i++) {
            arr3[n+i] = arr2[i];
        }
        for (int no : arr3) {
            System.out.print(no+" ");
        }
    }
}
