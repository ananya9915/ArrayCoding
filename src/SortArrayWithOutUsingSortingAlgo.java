
public class SortArrayWithOutUsingSortingAlgo {
    public static void main(String[] args) {
        int[] arr={0,0,1,2,2,0,1,0,1,2,2,1,0,2};
        int[] arr1=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                arr1[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                arr1[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==2)
            {
                arr1[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
    
}
