import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    scan.nextLine();
    Map<String, Integer> map = new Hashtable<String, Integer>();

    while (n-- > 0) {
      String name = scan.nextLine();
      int phone = Integer.parseInt(scan.nextLine());
      map.put(name, phone);
    }

    while (scan.hasNext()) {
      String s = scan.nextLine();
      if (map.get(s) != null)
        System.out.printf("%s=%d\n", s, map.get(s));
      else
        System.out.println("Not found");
    }
  }
}
