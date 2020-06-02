import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int row = scan.nextInt();

    ArrayList<ArrayList<Integer>> listOfList = new ArrayList<>(row);

    for (int i = 0; i < row; i++) {
      int arrSize = scan.nextInt();
      listOfList.add(new ArrayList<Integer>());
      for (int j = 0; j < arrSize; j++) {
        listOfList.get(i).add(scan.nextInt());
      }
      System.out.println("List: " + listOfList.get(i));
    }

    int query = scan.nextInt();
    for (int i = 0; i < query; i++) {
      int rowNum = scan.nextInt() - 1;
      int arrIndex = scan.nextInt() - 1;

      if (rowNum >= listOfList.size())
        System.out.println("ERROR!");
      else if (arrIndex >= listOfList.get(rowNum).size())
        System.out.println("ERROR!");
      else
        System.out.println(listOfList.get(rowNum).get(arrIndex));
    }
  }
}
