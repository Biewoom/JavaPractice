// char, boolean, byte, short, int, long, float, double
//
import java.io.*;
import java.lang.Math;
import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    for (int i = 0; i < t; i++) {
      try {
        long x = scan.nextLong();
        System.out.println(x + " can be fitted in:");
        if (x >= Math.pow(2, 7) * -1 && x <= Math.pow(2, 7) - 1)
          System.out.println("* byte");
        if (x >= Math.pow(2, 15) * -1 && x <= Math.pow(2, 15) - 1)
          System.out.println("* short");
        if (x >= Math.pow(2, 31) * -1 && x <= Math.pow(2, 31) - 1)
          System.out.println("* int");
        System.out.println("* long");

      } catch (Exception e) {
        System.out.println(scan.next() + " can't be fitted anywhere.");
      }
    }
  }
}