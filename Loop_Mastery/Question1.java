//Print numbers without using numbers (only loops & char)

package Loop_Mastery;

public class Question1 {
  public static void main(String[] args) {
    for (char ch='1'; ch <= '9'; ch++){
      System.out.println(ch); //1-9
    }
    System.out.println("1-9 Numbers...");
    System.out.println();

    for(char tens = '0'; tens <= '9'; tens++){
      for(char ones = '0'; ones <= '9'; ones++){
        if (ones == '0' && tens == '0') {
          continue;
        }
        System.out.println("" + tens + ones);
      }
    }
  }
}
