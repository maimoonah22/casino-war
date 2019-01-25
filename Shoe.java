package casino_war;

import java.util.ArrayList;
import java.util.Collections;

import casino_war.Card;

public class Shoe 
{
	private final int decks;
	private ArrayList<Card> cards;
	
	public Shoe(int decks)
	{
		this.decks = decks;
		reset();
	}
	
	public Card dealCard()
	{
		return cards.remove(cards.size() - 1);
	}
	
	public int cardsLeft()
	{
		return cards.size();
	}
	
	public void reset()
	{
		cards = new ArrayList<Card>();

		for(String suit : new String[]{"H", "D", "S", "C"})
			for(int value = 7; value <= 14; value++)
				for(int x = 1; x <= decks; x++)
					cards.add(new Card(suit, value));

		Collections.shuffle(cards);
	}
}
