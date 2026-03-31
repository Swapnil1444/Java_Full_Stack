import heapq

class Node:
    def __init__(self, board, g, h, parent):
        self.board = board
        self.g = g
        self.h = h
        self.f = g + h
        self.parent = parent

    def __lt__(self, other):
        return self.f < other.f


# Goal state
goal = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 0]
]


# Heuristic: misplaced tiles
def calculate_h(board):
    count = 0
    for i in range(3):
        for j in range(3):
            if board[i][j] != 0 and board[i][j] != goal[i][j]:
                count += 1
    return count


# Check goal
def is_goal(board):
    return board == goal


# Copy board
def copy(board):
    return [row[:] for row in board]


# Print board
def print_board(board):
    for row in board:
        print(*row)
    print()


# Generate neighbors
def get_neighbors(node):
    neighbors = []
    x, y = 0, 0

    # Find blank (0)
    for i in range(3):
        for j in range(3):
            if node.board[i][j] == 0:
                x, y = i, j

    moves = [(-1,0), (1,0), (0,-1), (0,1)]

    for dx, dy in moves:
        nx, ny = x + dx, y + dy

        if 0 <= nx < 3 and 0 <= ny < 3:
            new_board = copy(node.board)

            # Swap
            new_board[x][y], new_board[nx][ny] = new_board[nx][ny], 0

            h = calculate_h(new_board)
            neighbors.append(Node(new_board, node.g + 1, h, node))

    return neighbors


# A* Algorithm
def solve(start):
    open_list = []
    closed = set()

    start_node = Node(start, 0, calculate_h(start), None)
    heapq.heappush(open_list, start_node)

    while open_list:
        current = heapq.heappop(open_list)

        print_board(current.board)

        if is_goal(current.board):
            print("Goal Reached!")
            return

        closed.add(str(current.board))

        for neighbor in get_neighbors(current):
            if str(neighbor.board) not in closed:
                heapq.heappush(open_list, neighbor)

    print("No solution found.")


# Main
if __name__ == "__main__":
    start = [
        [1, 2, 3],
        [0, 4, 6],
        [7, 5, 8]
    ]

    solve(start)