import java.lang.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();

    double endPoint = Math.floor(A.length() / 2);

    for (int i = 0; i < endPoint; i++) {
      if (A.charAt(i) != A.charAt(A.length() - i - 1)) {
        System.out.println("No");
        return;
      }
    }

    System.out.println("Yes");
  }
}
