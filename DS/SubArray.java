import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int cnt = 0;
    int n = scan.nextInt();
    int[] SumArray = new int[n + 1];

    for (int i = 1; i < n + 1; i++) {
      SumArray[i] = SumArray[i - 1] + scan.nextInt();
    }

    for (int start = 0; start < n; start++) {
      for (int end = start + 1; end < n + 1; end++) {
        if (SumArray[end] - SumArray[start] < 0)
          cnt++;
      }
    }
    System.out.println(cnt);
  }
}
