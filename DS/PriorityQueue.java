import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {
  private final static Scanner scan = new Scanner(System.in);
  private final static Priorities priorites = new Priorities();

  public static void main(String[] args) {
    int totalEvents = Integer.parseInt(scan.nextLine());
    List<String> events = new ArrayList<>();

    while (totalEvents-- != 0) {
      String event = scan.nextLine();
      events.add(event);
    }
    List<Student> students = priorites.getStudents(events);

    if (students.isEmpty()) {
      System.out.println("EMPTY");
    } else {
      for (Student st : students) {
        System.out.println(st.getName());
      }
    }
  }
}

class Student {
  private int id;
  private String name;
  private double cgpa;
  Student(int id, String name, double cgpa) {
    this.id = id;
    this.name = name;
    this.cgpa = cgpa;
  }
  public int getId() { return this.id; }
  public String getName() { return new String(this.name); }
  public double getCGPA() { return this.cgpa; }
}

class StudentComparator implements Comparator<Student> {
  @Override
  public int compare(Student x, Student y) {
    if (x.getCGPA() == y.getCGPA()) {
      if (x.getName().equals(y.getName()))
        return x.getId() - y.getId();
      else
        return x.getName().compareTo(y.getName());

    } else {
      if (y.getCGPA() > x.getCGPA())
        return 1;
      else
        return -1;
    }
  }
}

class Priorities {
  public List<Student> getStudents(List<String> events) {
    Comparator<Student> cmp = new StudentComparator();
    PriorityQueue<Student> pq = new PriorityQueue<Student>(cmp);
    for (int i = 0; i < events.size(); i++) {
      String[] eves = events.get(i).split(" ");
      if (eves.length == 1) {
        if (pq.size() > 0)
          pq.poll();
      } else {
        String name = eves[1];
        Double cpga = Double.parseDouble(eves[2]);
        int id = Integer.parseInt(eves[3]);
        pq.add(new Student(id, name, cpga));
      }
    }
    List<Student> result = new ArrayList<>(pq);
    Collections.sort(result, cmp);
    return result;
  }
}
