import java.util.*;
public class BinarySearch {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        int[] a = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        s.nextLine();
        int target = s.nextInt();
        s.close();
        int mid = n;
            int left = 0;
            int right = n-1;
            int c = 0;
        while(left<=right)
        {
            mid = (right+left)/2;
            c++;
            if(a[mid]<target)
            {
                left = mid+1;
            }
            else if(a[mid]>target)
            {
                right = mid-1;
            }
            else if(a[mid]==target)
            {
                System.out.println(target+" found at location "+mid);
                System.out.println(c+" comparisons are done");
                return;
            }
        }
        System.out.println("Not found");
        System.out.println(c+" comparisons are done");
        return;
    }
}