import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    while (scan.hasNext()) {
      String inputStr = scan.next();

      boolean flag = true;
      Stack<Character> stack = new Stack<Character>();

      for (int i = 0; i < inputStr.length(); i++) {
        char input = inputStr.charAt(i);
        if (input == '}') {
          if (stack.size() <= 0 || (stack.pop() != '{')) {
            flag = false;
            break;
          }
        } else if (input == ']') {
          if (stack.size() <= 0 || (stack.pop() != '[')) {
            flag = false;
            break;
          }
        } else if (input == ')') {
          if (stack.size() <= 0 || (stack.pop() != '(')) {
            flag = false;
            break;
          }
        } else
          stack.push(input);
      }
      if (flag && (stack.size() == 0))
        System.out.println("true");
      else
        System.out.println("false");
    }
  }
}
