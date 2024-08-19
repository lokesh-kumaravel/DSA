package DSA;
import java.util.*;
public class BFS {
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static void main(String[] args) {
        
        int v = 5;
        for(int i = 0;i<v;i++)
        {
            list.add(new ArrayList<>());
        }
        addedge(0,1);
        addedge(2,3);
        addedge(1,2);
        addedge(3,4);
        addedge(0,4);   
        addedge(1,4);   
        BFSOperation(0);
        // for(int i = 0;i<list.size();i++)
        // {
        //     System.out.println(list.get(i));
        // }
    }
    private static void addedge(int u,int v)
    {
        list.get(u).add(v);
        list.get(v).add(u);
    }
    private static void BFSOperation(int start_v)
    {
        int V = list.size();
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        visited[start_v] = true;
        queue.add(start_v);
        while(queue.size()!=0)
        {
            int k = queue.remove();
            System.out.print(k+" ");
            for(int i = 0;i<list.get(k).size();i++)
            {
                int m = list.get(k).get(i);
                if(!visited[m])
                {
                    queue.add(m);
                    visited[m] = true;
                }
            }
        }
    }
}