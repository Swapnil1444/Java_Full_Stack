import java.util.*;

public class DFS {

    LinkedList<Integer>[] adj;
    boolean[] visited;

    public DFS(int v){

        adj=new LinkedList[v];
        visited=new boolean[v];
        for(int i=0;i<v; i++){

            adj[i]=new LinkedList<>();
        }

    }
    void addEdge(int v, int w){

        adj[v].add(w);

        // for (LinkedList<Integer> linkedList : adj) {
        //     System.out.println(linkedList);
        // }
    }

    void dfs(int v){
        visited[v]=true;
        System.out.println(v+" ");

        for(int n:adj[v]){
            if(!visited[n]){
                dfs(n);
            }
        }


    }



    public static void main(String[] args) {
        DFS s=new DFS(4);

        s.addEdge(0, 1);
        s.addEdge(0, 2);
        s.addEdge(1, 3);
        s.addEdge(2,3);
       // s.addEdge(2, 4);

        System.out.println("DFS Traversal:");
        s.dfs(0);

    }
}
