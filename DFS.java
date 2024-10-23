import java.util.*;
public class DFS {
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static void main(String[] args) {
        int v = 8;
        for(int i = 0;i<v;i++)
        {
            list.add(new ArrayList<>());
        }
        addedge(0,1);
        addedge(0,2);
        addedge(0,3);
        addedge(1,3);
        addedge(1,4);
        addedge(1,7);
        addedge(2,4);   
        addedge(3,4);   
        addedge(4,5);   
        addedge(5,6);   
        addedge(5,7);   
        DFSOperation(0);
    }
    public static void addedge(int u,int v)
    {
        list.get(u).add(v);
        list.get(v).add(u);
    }
    public static void DFSOperation(int start_v)
    {
        int v = list.size();
        boolean[] visited = new boolean[v];
        DFS2(start_v,visited);
    }
    public static void DFS2(int start_v,boolean[] visited)
    {
        visited[start_v] = true;
        System.out.println(start_v);
        for(int i = 0;i<list.get(start_v).size();i++)
        {
            int cur_index = list.get(start_v).get(i);
            if(!visited[cur_index])
            {
                visited[cur_index] = true;
                DFS2(cur_index, visited);
            }
        }
    }
}
