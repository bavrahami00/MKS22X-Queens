public class QueenBoard {
  private int[][] board;
  public QueenBoard(int size) {
    board = new int[size][size];
  }
  public boolean addQueen(int r, int c) {
    if (board[c][r] != 0) {
      return false;
    }
    board[c][r] = -1;
    for (int x = r+1; x < board[0].length; x++) {
      for (int i = 0; i < board.length; i++) {
        if (i-x == c-r) {
          board[i][x] += 1;
        }
        else if (i == c) {
          board[i][x] += 1;
        }
        else if (i+x == c+r) {
          board[i][x] += 1;
        }
      }
    }
    return true;
  }
  public boolean removeQueen(int r, int c) {
    if (board[c][r] != -1) {
      return false;
    }
    board[c][r] = 0;
    for (int x = r+1; x < board[0].length; x++) {
      for (int i = 0; i < board.length; i++) {
        if (i-x == c-r) {
          board[i][x] -= 1;
        }
        else if (i == c) {
          board[i][x] -= 1;
        }
        else if (i+x == c+r) {
          board[i][x] -= 1;
        }
      }
    }
    return true;
  }
  public String toString() {
    String ans = "";
    for (int x = 0; x < board[0].length; x++) {
      for (int i = 0; i < board.length; i++) {
        if (board[i][x] == -1) {
          ans += "Q ";
        }
        else if (board[i][x] > 0) {
          ans += board[i][x] + " ";
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
    for (int x = 0; x < board[0].length; x++) {
      for (int i = 0; i < board.length; i++) {
        if (board[i][x] != 0) {
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
