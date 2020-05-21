import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

  private static Scanner scan = new Scanner(System.in);
  public static byte B = scan.nextByte();
  public static byte H = scan.nextByte();
  public static boolean flag = (B > 0 && H > 0) ? true : false;

  static {
    if (!flag)
      System.out.println(
          "java.lang.Exception: Breadth and height must be positive");
  }

  public static void main(String[] args) {
    if (flag) {
      int area = B * H;
      System.out.print(area);
    }
  }

} // end of class
