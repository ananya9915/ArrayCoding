import java.util.Scanner;
class MinimumDistanceBetweenTwoNumbers {
    int minDist(int arr[], int n, int x, int y) {
        int i = 0, p = -1, min_dist = Integer.MAX_VALUE;
        for (i = 0; i < n; i++) {
            if (arr[i] == x || arr[i] == y) {
                if (p != -1 && arr[i] != arr[p]) {
                    min_dist = Math.min(min_dist, i - p);
                }
                p = i;
            }
        }
        if (min_dist == Integer.MAX_VALUE) {
            return -1;
        }
        return min_dist;
    }
    public static void main(String[] args) {
        MinimumDistanceBetweenTwoNumbers min = new MinimumDistanceBetweenTwoNumbers();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length Of The Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter The Elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter First Element: ");
        int x = sc.nextInt();
        System.out.println("Enter Second Element: ");
        int y = sc.nextInt();
        System.out.println("Minimum distance between " + x + " and " + y + " is " + min.minDist(arr, n, x, y));
    }
}