import java.util.*;

public class solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();

    String[] pairLeft = new String[t];
    String[] pairRight = new String[t];

    for (int i = 0; i < t; i++) {
      pairLeft[i] = scan.next();
      pairRight[i] = scan.next();
    }
    HashSet<String> hashset = new HashSet<String>();
    for (int i = 0; i < t; i++) {
      String temp = pairLeft[i] + " " + pairRight[i];
      hashset.add(temp);
      System.out.println(hashset.size());
    }
  }
}
