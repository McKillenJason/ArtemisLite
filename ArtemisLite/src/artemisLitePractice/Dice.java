package artemisLitePractice;
import java.util.Random;
public class Dice {
	private int value;
	public int getValue() {
		return this.value;
	}
	public int rollDice() {
		Random rng = new Random();
		int diceValue = rng.nextInt(6);
		System.out.println("The dice value was " + diceValue);
		this.value = diceValue;
		return diceValue;
	}
}
