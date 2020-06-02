import java.util.Scanner;
import java.util.regex.*;

public class Solution {

  public static boolean checkValid(String str) {
    try {
      Pattern tryPattern = Pattern.compile(str);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int testCases = Integer.parseInt(scan.nextLine());
    while (testCases > 0) {
      String pattern = scan.nextLine();
      System.out.println(checkValid(pattern) ? "Valid" : "Invalid");
      testCases--;
    }
  }
}
