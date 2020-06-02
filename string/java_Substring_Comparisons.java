import java.util.*;

public class Solution {

  public static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";

    for (int i = 0; i < s.length() - k + 1; i++) {
      String comparedStr = s.substring(i, i + k);
      if (smallest.length() == 0)
        smallest = comparedStr;
      else if (smallest.compareTo(comparedStr) > 0)
        smallest = comparedStr;
      else
        ;

      if (largest.length() == 0)
        largest = comparedStr;
      else if (largest.compareTo(comparedStr) < 0)
        largest = comparedStr;
      else
        ;
    }
    return smallest + "\n" + largest;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    int k = scan.nextInt();
    scan.close();

    System.out.println(getSmallestAndLargest(s, k));
  }
}
