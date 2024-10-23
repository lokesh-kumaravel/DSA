
import java.util.Scanner;

public class LinearHashing {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int[] main = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i] = s.nextInt();
            find(a[i],n,main);
        }
        for(int i = 0;i<n;i++)
        {
            System.out.println("index "+i+" value = "+main[i]);
        }
        s.close();
    }
    private static void find(int element,int n,int[] main)
    {
        int index = element%n;
        while(main[index]!=0)
        {
            index = (index+1)%n;
        }
        main[index] = element;
    }
}
