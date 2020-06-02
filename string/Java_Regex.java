import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    while (scan.hasNext()) {
      String IP = scan.next();
      System.out.println(IP.matches(new Myregex().pattern));
    }
  }
}

class Myregex {
  String patternToken = "([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])";
  String pattern = patternToken + "." + patternToken + "." + patternToken +
                   "." + patternToken;
  Myregex() {}
}
