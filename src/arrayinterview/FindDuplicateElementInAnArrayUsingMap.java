package arrayinterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateElementInAnArrayUsingMap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length Of The Array :");
        int m = sc.nextInt();
        System.out.println("Enter The Elements :");
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer,Integer> mp = new HashMap<>();
        for(int no:arr)
        {
            Integer count=mp.get(no);
            if(count==null)
            {
                mp.put(no,1);
            }
            else
            {
                count=count+1;
                mp.put(no, count);
            }
        }
        System.out.println("Duplicate Elements Are :");
        Set<Map.Entry<Integer,Integer>> ss=mp.entrySet();
        for(Map.Entry<Integer,Integer> me:ss)
        {
            if(me.getValue()>1)
            {
                System.out.println(me.getKey());
            }
        }
    }
}
