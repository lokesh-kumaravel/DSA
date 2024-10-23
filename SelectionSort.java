import java.util.*;
public class SelectionSort
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
        find(a,n);
    }
    private static void find(int[] a,int n)
    {
        for(int i = 0;i<n;i++)
        {
            int min =  Integer.MAX_VALUE;
            int k = 0;
            for(int j = i+1;j<n;j++)
            {
                if(a[j]<min)
                {
                    min = a[j];
                    k = j;
                }
            }
            if(min<a[i])
            {
                int temp = a[i];
                a[i] = a[k];
                a[k] = temp;
            }
            for(int m = 0;m<n;m++)
            {
                System.out.print(a[m]+" ");
            }
            System.out.println();
        }
    }
}
