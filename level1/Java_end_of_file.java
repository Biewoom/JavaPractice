import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i = 1;
    while (scan.hasNext()) {
      String s = scan.nextLine();
      System.out.printf("%d %s\n", i++, s);
    }
  }
}