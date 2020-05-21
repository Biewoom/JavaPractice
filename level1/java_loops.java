import java.io.*;
import java.util.*;

public class Solution {
  private static final Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {
    int N = scan.nextInt();
    scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    for (int i = 1; i <= 10; i++) {
      int result = N * i;
      System.out.printf("%d x %d = %d\n", N, i, result);
    }
  }
}