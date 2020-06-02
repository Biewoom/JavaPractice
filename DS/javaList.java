import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    List<Integer> list = new LinkedList<Integer>();
    while (n-- > 0) {
      list.add(scan.nextInt());
    }

    int query = scan.nextInt();
    while (query-- > 0) {
      String op = scan.next();
      if (op.equals("Insert")) {
        int index = scan.nextInt();
        int value = scan.nextInt();
        if (index < list.size())
          list.add(index, value);
        else
          list.add(value);
      } else {
        int index = scan.nextInt();
        list.remove(index);
      }
    }
    for (int num : list) {
      System.out.print(num + " ");
    }
  }
}
