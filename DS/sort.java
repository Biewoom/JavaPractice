import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int testcases = Integer.parseInt(scan.nextLine());

    List<Student> studentList = new ArrayList<Student>();
    while (testcases-- > 0) {
      int id = scan.nextInt();
      String fname = scan.next();
      double cgpa = scan.nextDouble();

      Student st = new Student(id, fname, cgpa);
      studentList.add(st);
    }

    Collections.sort(studentList, new sortByCGPA());
    for (Student st : studentList) {
      System.out.println(st.getFname());
    }
  }
}

class Student {
  private int id;
  private String fname;
  private double cgpa;
  public Student(int id, String fname, double cgpa) {
    super();
    this.id = id;
    this.fname = fname;
    this.cgpa = cgpa;
  }
  public int getId() { return id; }
  public String getFname() { return fname; }
  public double getCgpa() { return cgpa; }
}

class sortByCGPA implements Comparator<Student> {
  public int compare(Student a, Student b) {
    if (a.getCgpa() == b.getCgpa()) {

      if (aget.Fname().equals(b.getFname()))
        return a.getId() - b.getId();
      else
        return a.getFname().compareTo(b.getFname());
    } else {
      if (b.getCgpa() > a.getCgpa())
        return 1;
      else
        return -1;
    }
  }
}
