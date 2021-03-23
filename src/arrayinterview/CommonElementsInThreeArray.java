package arrayinterview;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonElementsInThreeArray {

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
        System.out.println("Enter The Length Of The Array: ");
        int l = sc.nextInt();
        int arr3[] = new int[l];
        System.out.println("Enter The Elements :");
        for (int i = 0; i < l; i++) {
            arr3[i] = sc.nextInt();
        }
        int x = 0, y = 0, z = 0;
        ArrayList<Integer> ar = new ArrayList<>();
        while (x < arr1.length && y < arr2.length && z < arr3.length) {
            if (arr1[x] == arr2[y] && arr2[y] == arr3[z]) {
                ar.add(arr1[x]);
                x++;
                y++;
                z++;
            } else if (arr1[x] < arr2[y]) {
                x++;
            } else if (arr2[y] < arr3[z]) {
                y++;
            } else {
                z++;
            }

        }
        System.out.print("Common Elements :");
        for (int nn : ar) {
            System.out.print(nn+" ");
        }
    }
}
