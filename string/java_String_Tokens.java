import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();

    String delims = "[ !,?._'@/]+";
    String[] strArr = s.trim().split(delims);

    if (s == null || s.trim().equals("")) {
      System.out.println("0");
      return;
    } else if (s.length() > 400000) {
      return;
    } else {
      System.out.println(strArr.length);
    }
    for (String tempStr : strArr) {
      System.out.println(tempStr);
    }
    scan.close();
  }
}
