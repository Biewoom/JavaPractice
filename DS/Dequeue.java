import java.util.*;

public class test {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int Max = 0;
    int cnt = 0;

    Deque<Integer> deque = new LinkedList<Integer>();
    Map<Integer, Integer> map = new Hashtable<Integer, Integer>();

    while (m-- > 1) {
      int num = scan.nextInt();
      deque.add(num);

      if (map.get(num) == null) {
        map.put(num, 1);
        cnt++;
      } else
        map.put(num, map.get(num) + 1);
      n--;
    }
    System.out.println("map: " + map);

    while (n-- > 0) {
      int num = scan.nextInt();
      deque.add(num);
      if (map.get(num) == null) {
        map.put(num, 1);
        cnt++;
      } else
        map.put(num, map.get(num) + 1);

      Max = Math.max(Max, cnt);

      int removedNum = deque.poll();
      map.put(removedNum, map.get(removedNum) - 1);
      if (map.get(removedNum) == 0)
        cnt--;
    }
    System.out.println(Max);
  }
}
