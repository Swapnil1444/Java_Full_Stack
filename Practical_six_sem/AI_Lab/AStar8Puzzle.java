import java.util.*;

class Node {
    int[][] board;
    int g, h, f;
    Node parent;

    public Node(int[][] board, int g, int h, Node parent) {
        this.board = board;
        this.g = g;
        this.h = h;
        this.f = g + h;
        this.parent = parent;
    }
}

public class AStar8Puzzle {

    static int[][] goal = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 0}
    };

    // Heuristic: Number of misplaced tiles
    static int calculateH(int[][] board) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != 0 && board[i][j] != goal[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    // Check goal state
    static boolean isGoal(int[][] board) {
        return Arrays.deepEquals(board, goal);
    }

    // Copy board
    static int[][] copy(int[][] board) {
        int[][] newBoard = new int[3][3];
        for (int i = 0; i < 3; i++)
            newBoard[i] = board[i].clone();
        return newBoard;
    }

    // Print board
    static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
        System.out.println();
    }

    // Generate neighbors
    static List<Node> getNeighbors(Node node) {
        List<Node> neighbors = new ArrayList<>();
        int x = 0, y = 0;

        // Find blank (0)
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (node.board[i][j] == 0) {
                    x = i;
                    y = j;
                }

        int[][] moves = {{-1,0},{1,0},{0,-1},{0,1}};

        for (int[] move : moves) {
            int nx = x + move[0];
            int ny = y + move[1];

            if (nx >= 0 && ny >= 0 && nx < 3 && ny < 3) {
                int[][] newBoard = copy(node.board);

                // Swap
                newBoard[x][y] = newBoard[nx][ny];
                newBoard[nx][ny] = 0;

                int h = calculateH(newBoard);
                neighbors.add(new Node(newBoard, node.g + 1, h, node));
            }
        }
        return neighbors;
    }

    // A* Algorithm
    static void solve(int[][] start) {

        PriorityQueue<Node> open = new PriorityQueue<>(Comparator.comparingInt(n -> n.f));
        Set<String> closed = new HashSet<>();

        Node startNode = new Node(start, 0, calculateH(start), null);
        open.add(startNode);

        while (!open.isEmpty()) {
            Node current = open.poll();

            printBoard(current.board);

            if (isGoal(current.board)) {
                System.out.println("Goal Reached!");
                return;
            }

            closed.add(Arrays.deepToString(current.board));

            for (Node neighbor : getNeighbors(current)) {
                if (!closed.contains(Arrays.deepToString(neighbor.board))) {
                    open.add(neighbor);
                }
            }
        }

        System.out.println("No solution found.");
    }

    public static void main(String[] args) {

        int[][] start = {
                {1, 2, 3},
                {0, 4, 6},
                {7, 5, 8}
        };

        solve(start);
    }
}