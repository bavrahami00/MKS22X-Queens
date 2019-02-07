public class QueenBoard {
  private int[][] board;
  public QueenBoard(int size) {
    board = new int[size][size];
  }
  private boolean addQueen(int r, int c) {
    if (board[r][c] != 0) {
      return false;
    }
    board[r][c] = -1;
    return true;
  }
  private boolean removeQueen(int r, int c) {
    if (board[r][c] != -1) {
      return false;
    }
    board[r][c] = 0;
    return true;
  }
  public String toString() {
    for (int x = 0; x < board.length; x++) {
      for (int i = 0; i < board[0].length; i++) {
        if (board[x][i] == -1) {
          System.out.print("Q");
        }
        else {
          System.out.printl("_");
        }
      }
      System.out.println();
    }
  }
}
