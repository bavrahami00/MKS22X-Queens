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
    return true;
  }
  public boolean removeQueen(int r, int c) {
    if (board[r][c] != -1) {
      return false;
    }
    board[r][c] = 0;
    return true;
  }
  public String toString() {
    String ans = "";
    for (int x = 0; x < board.length; x++) {
      for (int i = 0; i < board[0].length; i++) {
        if (board[x][i] == -1) {
          ans += "Q";
        }
        else {
          ans += "_";
        }
      }
      ans += "\n";
    }
    return ans;
  }
}
