import java.util.*;

public class Solution {
  public static boolean canWin(int cur, int leap, int[] game) {
    if (cur < 0 || game[cur] == 1)
      return false;
    if (cur == game.length - 1 || cur + leap >= game.length)
      return true;

    game[cur] = 1;
    return (canWin(cur + 1, leap, game)) || (canWin(cur - 1, leap, game)) ||
        (canWin(cur + leap, leap, game));
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int q = scan.nextInt();

    while (q-- > 0) {
      int n = scan.nextInt();
      int leap = scan.nextInt();

      int[] game = new int[n];
      for (int i = 0; i < n; i++) {
        game[i] = scan.nextInt();
      }
      System.out.println((canWin(0, leap, game)) ? "YES" : "NO");
    }
    scan.close();
  }
}
