from collections import deque

class GraphTraversal:
    def __init__(self, v):
        self.adj = [[] for _ in range(v)]
        self.visited = [False] * v

    # Add edge (undirected graph)
    def add_edge(self, v, w):
        self.adj[v].append(w)
        self.adj[w].append(v)

    # DFS (Recursive)
    def DFS(self, node):
        self.visited[node] = True
        print(node, end=" ")

        for neighbor in self.adj[node]:
            if not self.visited[neighbor]:
                self.DFS(neighbor)

    # BFS (Using Queue)
    def BFS(self, start):
        visited_bfs = [False] * len(self.adj)
        queue = deque()

        visited_bfs[start] = True
        queue.append(start)

        while queue:
            node = queue.popleft()
            print(node, end=" ")

            for neighbor in self.adj[node]:
                if not visited_bfs[neighbor]:
                    visited_bfs[neighbor] = True
                    queue.append(neighbor)

    # Reset visited for DFS reuse
    def reset_visited(self):
        self.visited = [False] * len(self.adj)


# Main function
if __name__ == "__main__":
    g = GraphTraversal(6)

    g.add_edge(0, 1)
    g.add_edge(0, 3)
    g.add_edge(1, 2)
    g.add_edge(2, 4)
    g.add_edge(4, 5)
    g.add_edge(3, 5)

    print("DFS Traversal:")
    g.DFS(0)

    g.reset_visited()

    print("\nBFS Traversal:")
    g.BFS(0)