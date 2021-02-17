package artemisLitePractice;
import java.util.Random;
public class Player {
	private String name;
	private int credits;
	private Element location;

	public Player(){
		
	}
	
	public Player(String name, int credits) {
		super();
		this.name = name;
		this.credits = credits;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int i) {
		this.credits = i;
	}
	public Element getLocation() {
		return location;
	}
	public void setLocation(Element location) {
		this.location = location;
	}
}
