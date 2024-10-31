import java.util.*;
//Time complexity
public class QuickSort
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        sort(a,0,n-1);
    }
    public static void sort(int[] arr,int low,int high)
    {
        if(low<high)
        {
        int j = partition(arr,low,high);
        System.out.print('[');
        for(int i = 0;i<arr.length;i++)
        {
            if(i==arr.length-1)
            {
            System.out.print(arr[i]);
            }
            else
            {
            System.out.print(arr[i]+", ");
            }
        }
        System.out.print(']');
        System.out.println();
        sort(arr,low,j-1);
        sort(arr,j+1,high);
        }
    }
    public static int partition(int[] arr,int low,int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high+1;
        while(i<j)
        {
        do
        {
            i++;
        }while(i<=high&&pivot>=arr[i]);
        do
        {
            j--;
        }while(pivot<arr[j]);
        if(i<j)
        {
            swap(arr,i,j);
        }
        }
        swap(arr,low,j);
        return j;
    }
    public static void swap(int[] a,int i,int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
