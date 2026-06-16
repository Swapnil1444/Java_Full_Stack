arr = [64, 25, 12, 22, 11]

for i in range(len(arr)):
    min_index = i

    for j in range(i + 1, len(arr)):
        if arr[j] < arr[min_index]:
            min_index = j

    arr[i], arr[min_index] = arr[min_index], arr[i]

print("Sorted Array:")
print(arr)

#
import sys

graph = [
    [0, 4, 0, 0, 0, 0],
    [4, 0, 8, 0, 0, 0],
    [0, 8, 0, 7, 2, 4],
    [0, 0, 7, 0, 9, 14],
    [0, 0, 2, 9, 0, 10],
    [0, 0, 4, 14, 10, 0]
]

V = len(graph)

dist = [sys.maxsize] * V
dist[0] = 0

visited = [False] * V

for _ in range(V):
    min_dist = sys.maxsize
    u = -1

    for v in range(V):
        if not visited[v] and dist[v] < min_dist:
            min_dist = dist[v]
            u = v

    visited[u] = True

    for v in range(V):
        if graph[u][v] > 0 and not visited[v]:
            if dist[v] > dist[u] + graph[u][v]:
                dist[v] = dist[u] + graph[u][v]

print("Vertex Distance from Source")
for i in range(V):
    print(i, ":", dist[i])