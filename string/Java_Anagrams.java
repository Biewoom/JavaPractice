import java.util.*;
import java.util.Scanner;

public class Solution {

  static boolean isAnagram(String a, String b) {
    int[] myArr = new int[26];

    a = a.toLowerCase();
    b = b.toLowerCase();

    char[] charA = a.toCharArray();
    char[] charB = b.toCharArray();

    for (char c_a : charA) {
      myArr[(int)c_a - (int)'a'] += 1;
    }
    for (char c_b : charB) {
      myArr[(int)c_b - (int)'a'] -= 1;
    }
    for (int cnt : myArr) {
      if (cnt != 0)
        return false;
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();

    boolean ret = isAnagram(a, b);
    System.out.println((ret) ? "Anagrams" : "Not Anagrams");
  }
}
