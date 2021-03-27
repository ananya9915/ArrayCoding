package arrayinterview;

import java.util.Scanner;

public class MaximunAndMinimumElementInAnArray {
    public int maxElement(int arr[])
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
                
        
    }
    
    public int minElement(int arr[])
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
                
        
    }
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length Of The Array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Maximum Element: "+maxElement(arr));
        System.out.println("Minimum Element: "+minElement(arr));
        
    }
    
}
