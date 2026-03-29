import java.util.*;

public class GraphTraversal {

    private LinkedList<Integer>[] adj;
    private boolean[] visited;

    
    public GraphTraversal(int v) {
        adj = new LinkedList[v];
        visited = new boolean[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }


    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    void DFS(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adj[node]) {
            if (!visited[neighbor]) {
                DFS(neighbor);
            }
        }
    }

    void BFS(int start) {
        boolean[] visitedBFS = new boolean[adj.length];
        Queue<Integer> queue = new LinkedList<>();

        visitedBFS[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : adj[node]) {
                if (!visitedBFS[neighbor]) {
                    visitedBFS[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    
    void resetVisited() {
        Arrays.fill(visited, false);
    }

  
    public static void main(String[] args) {

        GraphTraversal g = new GraphTraversal(6);

        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(2, 4);
        g.addEdge(4, 5);
        g.addEdge(3, 5);

        System.out.println("DFS Traversal:");
        g.DFS(0);

        g.resetVisited();

        System.out.println("\nBFS Traversal:");
        g.BFS(0);
    }
}