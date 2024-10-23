
import java.util.Scanner;

public class QuadraticProbing {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int[] main = new int[n+n/2];
        for(int i = 0;i<n;i++)
        {
            a[i] = s.nextInt();
            find(a[i],n+n/2,main);
        }
        System.out.println();
        System.out.println("Hash Table:");
        for(int i = 0 ;i<n+n/2;i++)
        {
            if(main[i]!=0)
            {
            System.out.println("Element at position "+i+": "+main[i]);
            }
            else
            {
                System.out.println("Element at position "+i+": -1");
            }
        }
        s.close();
    }
    private static void find(int element,int n,int[] main)
    {
        int index = element%n;
        int i = 1;
        while(main[index]!=0)
        {
            System.out.println("Inserting "+element+" in index "+index +" -> Collision");
            index = (element+(i*i))%n;
            i++;
        }
        main[index] = element;
        System.out.println("Inserting "+element+" in index "+index);
    }
}
