package CodingAssignmentWeek6;

import java.util.ArrayList;
import java.util.List;

public class Player {

	
	private List<Card> hand = new ArrayList<Card>();
    private int score;
    private String name;

    public Player() {
        setScore(9);
    }

    public Player(String newName) {
        name = newName;
        setScore(0);
    }

    public void describe() {
        System.out.printf("Player %s has the following cards: \n", name);
        for (Card card : hand) {
            card.describe();
        }
	}

	public void draw(Deck deck) {
		hand.add(deck.draw());
		
	}

	public Card flip() {
		return hand.remove(hand.size() - 1);
	}

	public void incrementScore() {
		score++;
		
	}

	public int getScore() {
        return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
