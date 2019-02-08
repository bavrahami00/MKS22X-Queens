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
    for (int x = r+1; x < board.length; x++) {
      if (c-x+r >= 0) {
        board[c-x+r][x] += 1;
      }
      board[c][x] += 1;
      if (c+x-r < board[0].length) {
        board[c+x-r][x] += 1;
      }
    }
    return true;
  }
  public boolean removeQueen(int r, int c) {
    if (board[c][r] != -1) {
      return false;
    }
    board[c][r] = 0;
    for (int x = r+1; x < board.length; x++) {
      if (c-x+r >= 0) {
        board[c-x+r][x] -= 1;
      }
      board[c][x] -= 1;
      if (c+x-r < board[0].length) {
        board[c+x-r][x] -= 1;
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
    for (int x = 0; x < board[0].length; x++) {
      boolean does = true;
      boolean made = false;
      for (int i = 0; i < board.length && does; i++) {

      }
    }
    return false;
  }
}
