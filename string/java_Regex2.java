import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {
  public static void main(String[] args) {
    String regex = ;
    Pattern p = Pattern.compile(regex);

    Scanner scan = new Scanner(System.in);
    int numSenetences = Integer.parseInt(scan.nextLine());

    while (numSenetences-- > 0) {
      String input = scan.nextLine();
      Matcher m = p.matcher(input);

      while (m.find()) {
        input = input.replaceAll();
        System.out.println(input);
      }
    }
    scan.close();
  }
}
