package arrayinterview;

import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicateElementFromArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length Of The Array :");
        int m = sc.nextInt();
        System.out.println("Enter The Elements :");
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> hs = new HashSet<>();
        System.out.println("...................................");
        for (int no : arr) {
            boolean b = hs.add(no);
            {
                if (b == false) {
                    System.out.println(no);
                }

            }
        }
    }

}
