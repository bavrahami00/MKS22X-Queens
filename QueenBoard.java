public class QueenBoard {
  private int[][] board;
  public QueenBoard(int size) {
    board = new int[size][size];
  }
  public boolean addQueen(int r, int c) {
    if (board[r][c] != 0) {
      return false;
    }
    board[r][c] = -1;
    for (int x = r+1; x < board.length; x++) {
      for (int i = 0; i < board[x].length; i++) {
        if (i-x == c-r) {
          board[x][i] += 1;
        }
      }
    }
    return true;
  }
  public boolean removeQueen(int r, int c) {
    if (board[r][c] != -1) {
      return false;
    }
    board[r][c] = 0;
    for (int x = r+1; x < board.length; x++) {
      for (int i = 0; i < board[x].length; i++) {
        if (i-x == c-r) {
          board[x][i] -= 1;
        }
      }
    }
    return true;
  }
  public String toString() {
    String ans = "";
    for (int x = 0; x < board.length; x++) {
      for (int i = 0; i < board[x].length; i++) {
        if (board[x][i] == -1) {
          ans += "Q ";
        }
        else if (board[x][i] > 0) {
          ans += "# ";
        }
        else {
          ans += "_ ";
        }
      }
      ans += "\n";
    }
    return ans;
  }
  private boolean isEmpty() {
    for (int x = 0; x < board.length; x++) {
      for (int i = 0; i < board[x].length; i++) {
        if (board[x][i] != 0) {
          return true;
        }
      }
    }
    return false;
  }
  public boolean solve() {
    if (isEmpty()) {
      throw new IllegalStateException();
    }
    return false;
  }
}
