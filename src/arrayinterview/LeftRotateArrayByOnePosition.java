
package arrayinterview;

import java.util.Scanner;

public class LeftRotateArrayByOnePosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter The Elements Of The Array");
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        
        int temp = array[0];
        for (int i = 1; i < n; i++) {
            array[i-1]=array[i];
        }
        array[n-1]=temp;
        System.out.println("After Rotation...............");
        for(int i:array){
            System.out.println(i);
        }
    }
}
