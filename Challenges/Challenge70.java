//70. Define a Student class with fields like name and age, and use toString to print student details.

package challenges;

public class Challenge70 {
  public static void main(String[] args) {
    Student student = new Student("sushanth", 22);
    System.out.println(student);
  }

  static class Student {
    String name;
    int age;

    Student(String name, int age) {
      this.name = name;
      this.age = age;
    }

    @Override
    public String toString() {
      return "Student{name='" + name + "', age=" + age + "}";
    }
  }
}
