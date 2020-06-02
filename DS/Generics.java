import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;

public class Solution {
  public static void main(String args[]) {
    Printer myPrinter = new Printer();
    Integer[] intArr = {1, 2, 3};
    String[] stringArr = {"Hello", "World"};

    myPrinter.printArray(intArr);
    myPrinter.printArray(stringArr);

    int count = 0;
    for (Method method : Printer.class.getDeclaredMethods()) {
      String name = method.getName();

      if (name.equals("printArray"))
        count++;
    }

    if (count > 1)
      System.out.println("Method overloading is not allowed!");
  }
}

class Printer {
  public static <T> void printArray(T[] t) {
    for (int i = 0; i < t.length; i++) {
      System.out.println(t[i]);
    }
  }
}
