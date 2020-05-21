import java.io.*;
import java.lang.Math;
import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    for (int i = 0; i < t; i++) {
      int a = scan.nextInt();
      int b = scan.nextInt();
      int n = scan.nextInt();

      int result = a;
      for (int j = 0; j < n; j++) {
        result += Math.pow(2, j) * b;
        System.out.printf("%d ", result);
      }
      System.out.printf("\n");
    }
    scan.close();
  }
}