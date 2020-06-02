import java.util.*;
import java.util.concurrent.*;

public class Solution {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int month = scan.nextInt();
    int day = scan.nextInt();
    int year = scan.nextInt();

    String res = Result.findDay(month, day, year);
    System.out.println(res);
  }
}

class Result {
  public static String findDay(int month, int day, int year) {

    Calendar calendar = Calendar.getInstance();
    calendar.set(year, month - 1, day, 0, 0);

    String Day = "";
    int dayNum = calendar.get(Calendar.DAY_OF_WEEK);

    switch (dayNum) {
    case 1:
      Day = "SUNDAY";
      break;
    case 2:
      Day = "MONDAY";
      break;
    case 3:
      Day = "TUESDAY";
      break;
    case 4:
      Day = "WEDNESDAY";
      break;
    case 5:
      Day = "THURSDAY";
      break;
    case 6:
      Day = "FRIDAY";
      break;
    case 7:
      Day = "SATURDAY";
      break;
    }

    return Day;
  }
}
