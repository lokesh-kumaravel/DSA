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
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n-1;j++)
            {
                if(a[j]>a[j+1])
                {
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                }
            }
            for(int k = 0;k<n;k++)
            {
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
    }
}
