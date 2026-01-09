//Concatenate and Convert: Take two strings, concatenate them, and convert the result to uppercase.

package challenges;

public class Challenge71 {
  public static void main(String[] args) {
    Concatenate concatenate = new Concatenate("Sushanth", "Thakur");
    System.out.println(concatenate);

  }

  static class Concatenate {
    String name1;
    String name2;

    Concatenate(String name1, String name2) {
      this.name1 = name1;
      this.name2 = name2;
    }

    @Override
    public String toString() {
      String result = name1 + " " + name2;
      return result.toUpperCase();
    }
  }
}
