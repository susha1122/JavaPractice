//Take an array of words and concatenate them into a single string using StringBuilder.

package challenges;

public class Challenge75 {
  public static void main(String[] args) {
    String[] array = {"Sushanth ", "Prasanth ", "Anjali ", "Abhishek "};

    StringBuilder sb = new StringBuilder();
    
    for (String word : array){
      sb.append(word).append("");
    }

    String result = sb.toString();
    System.out.println(result);

  }
}
