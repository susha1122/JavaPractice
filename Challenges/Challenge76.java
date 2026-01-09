//Create an object with final fields and a constructor to initialize them.

package challenges;

public class Challenge76 {
  private final String name;
  private final int age;

  public Challenge76(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
  
  public static void main(String[] args) {
    Challenge76 person = new Challenge76("Sushanth", 23);
    System.out.println(person.getName() + " is " + person.getAge() + " years Old");
  }
}
