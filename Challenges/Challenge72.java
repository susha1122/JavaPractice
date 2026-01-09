//Simulate a dice roll using Math.random() and display the outcome (1 to 6).

package challenges;

public class Challenge72 {
  public static void main(String[] args) {
    DiceRoll diceRoll = new DiceRoll();
    System.out.println(diceRoll);
  }
  static class DiceRoll {
    int dice;

    DiceRoll() {
      dice = (int)(Math.random() * 6) + 1;
    }

    @Override
    public String toString() {
      return "Dice Rolled " + dice;
    }
  }
}


