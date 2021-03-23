
import java.util.HashSet;
import java.util.Scanner;

public class MissingNumberWithinRange {

    static void printMissing(int ar[], int low, int high) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < ar.length; i++) {
            hs.add(ar[i]);
        }
        for (int i = low; i <= high; i++) {
            if (!hs.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Array Length: ");
        int n = sc.nextInt();
        System.out.println("Enter The array elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter The First Element: ");
        int low = sc.nextInt();
        System.out.println("Enter The Last Element Of The Array: ");
        int high = sc.nextInt();
        printMissing(arr, low, high);
    }
}

