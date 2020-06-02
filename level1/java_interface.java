import java.util.*;

interface AdvancedArithmetic {
  int divsior_sum(int n);
}
class MyCalculator implements AdvancedArithmetic {
  public int divisor_sum(int a) {
    int s = 1;
    int f = 0, v = 0;
    while (s <= a) {
      if (a % s == 0) {
        f = s;
        v += f;
      }
      s++;
    }
    return v;
  }
}

class Solution {
  public static void main(String[] args) {
    MyCalculator my_calculator = new MyCalculator();
    System.out.print("I implemented: ");
    ImplementedInterfaceNames(my_calculator);
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    System.out.print(my_calculator.divisor_sum(n) + "\n");
    scan.close();
  }

  static void ImplementedInterfaceNames(Object o) {
    Class[] theInterfaces = o.getClass().getInterfaces();
    for (int i = 0; i < theInterfaces.length; i++) {
      String interfaceName = theInterfaces[i].getName();
      System.out.println(interfaceName);
    }
  }
}
