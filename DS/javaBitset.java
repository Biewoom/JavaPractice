import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();

    BitSet bs1 = new BitSet(n);
    BitSet bs2 = new BitSet(n);

    while (m-- > 0) {
      String op = scan.next();
      int oprd1 = scan.nextInt();
      int oprd2 = scan.nextInt();

      // System.out.printf("%s %d %d\n", op, oprd1, oprd2);

      if (op.equals("AND")) {
        if (oprd1 == 1)
          bs1.and(bs2);
        else
          bs2.and(bs1);
      } else if (op.equals("OR")) {
        if (oprd1 == 1)
          bs1.or(bs2);
        else
          bs2.or(bs1);
      } else if (op.equals("XOR")) {
        if (oprd1 == 1)
          bs1.xor(bs2);
        else
          bs2.xor(bs1);
      } else if (op.equals("FLIP")) {
        if (oprd1 == 1)
          bs1.flip(oprd2);
        else
          bs2.flip(oprd2);
      } else {
        if (oprd1 == 1)
          bs1.set(oprd2);
        else
          bs2.set(oprd2);
      }
      System.out.printf("%d %d\n", bs1.cardinality(), bs2.cardinality());
    }
  }
}
