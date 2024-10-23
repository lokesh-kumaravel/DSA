
import java.util.ArrayList;
import java.util.Scanner;

public class SeparateChaining {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int n = 7;
        int[] a = new int[t];
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] arr = new ArrayList[7];
        for(int i = 0;i<n;i++)
        {
            arr[i] = new ArrayList<>();
        }
        for(int i = 0;i<t;i++)
        {
            a[i] = s.nextInt();
            find(a[i],n,arr);
        }
         for (int i = 0; i < n; i++) {
            if(arr[i].isEmpty())
            {
                System.out.println("at index " + i);
                System.out.println("No Hash Entry");
            }
            else
            {
            System.out.println("at index " + i);
                for (int j = 0; j < arr[i].size(); j++) 
                {
                    System.out.print(arr[i].get(j)+"->");
                }
                    System.out.println();
            }
        }
        s.close();
    }
    private static void find(int element,int n,ArrayList<Integer>[] arr)
    {
        int index = element%n;
        arr[index].add(element);
    }
}
