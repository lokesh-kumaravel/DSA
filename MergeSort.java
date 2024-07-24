import java.util.*;
public class Main 
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
    public static void sort(int[] arr ,int l,int r)
    {
        if(l<r)
        {
        int m = l+(r-l)/2;
        sort(arr,l,m);
        sort(arr,m+1,r);
        merge(arr,l,m,r);
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
            System.out.println();
        }
    }
    public static void merge(int[] arr,int l,int m,int r)
    {
        int n1 = m-l+1;
        int n2 = r-m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i = 0;i<n1;i++)
        {
            L[i] = arr[l+i];
        }
        for(int j = 0;j<n2;j++)
        {
            R[j] = arr[m+1+j];
        }
        int i = 0,j=0,k=l;
        while(i<n1&&j<n2)
        {
            if(L[i]<=R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while(i<n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        }
}
