package artemisLitePractice;
import java.util.ArrayList;
public class Game {

	public static void main(String[] args) {
		// TODO Implement the methods of buying, selling and upgrading properties
		// TODO Fix the ability of players to move
		// TODO Implement end game states for success
		// TODO Implement end game states for failures
		ArrayList<Element> board = new ArrayList<Element>();
		ArrayList<Element> ownedProperties = new ArrayList<Element>();
		ArrayList<Element> availableProperties = new ArrayList<Element>();
		Element e1 = new Element("A1", 150);
		Element e2 = new Element("A2", 140);
		Element e3 = new Element("A3", 400);
		Element e4 = new Element("B1", 200);
		Element e5 = new Element("B2", 175);
		Element e6 = new Element("C1", 300);
		Element e7 = new Element("C2", 100);
		Element e8 = new Element("C3", 160);
		Element e9 = new Element("D1", 140);
		Element e10 = new Element("D2", 420);
		Element e11 = new Element("D3", 340);
		board.add(e1);
		board.add(e2);
		board.add(e3);
		board.add(e4);
		board.add(e5);
		board.add(e6);
		board.add(e7);
		board.add(e8);
		board.add(e9);
		board.add(e10);
		board.add(e11);
		
		boolean gameOver = false;
		int turnsTaken = 0;
		
		availableProperties.addAll(board);
		Player p1 = new Player();
		p1.setName("Jason");
		p1.setCredits(200);
		p1.setLocation(board.get(0));
		
		while(!gameOver) {
			Dice dice = new Dice();
			// TODO Fix the moving location feature
			p1.setLocation(board.get((board.indexOf(p1.getLocation()) + (dice.rollDice() % board.size()))));
			Element p1CurrentTile = p1.getLocation();
			System.out.println(p1.getName() + " moved " + dice.getValue() + " spaces");
			System.out.println(p1.getName() + " is now at " + p1CurrentTile.getName());
			turnsTaken++;
			if(turnsTaken >= 100) {
				gameOver = true;
			}
		}
			
		
		
	}

}
