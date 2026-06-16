# N-Queens Problem using Backtracking

N = 4

# Create chess board
board = [[0 for i in range(N)] for j in range(N)]


# Function to print solution
def print_solution(board):
    print("Solution:\n")

    for i in range(N):
        for j in range(N):

            if board[i][j] == 1:
                print("Q", end=" ")
            else:
                print(".", end=" ")

        print()


# Function to check safe position
def is_safe(board, row, col):

    # Check same column
    for i in range(row):
        if board[i][col] == 1:
            return False

    # Check upper left diagonal
    i = row - 1
    j = col - 1

    while i >= 0 and j >= 0:
        if board[i][j] == 1:
            return False

        i -= 1
        j -= 1

    # Check upper right diagonal
    i = row - 1
    j = col + 1

    while i >= 0 and j < N:
        if board[i][j] == 1:
            return False

        i -= 1
        j += 1

    return True


# Backtracking function
def solve_n_queens(board, row):

    # If all queens are placed
    if row >= N:
        return True

    # Try placing queen in all columns
    for col in range(N):

        # Check if position is safe
        if is_safe(board, row, col):

            # Place queen
            board[row][col] = 1

            # Recursive call
            if solve_n_queens(board, row + 1):
                return True

            # BACKTRACK
            board[row][col] = 0

    return False


# Main program
if solve_n_queens(board, 0):

    print_solution(board)

else:
    print("No Solution Exists")