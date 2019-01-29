package casino_war;

import java.util.ArrayList;
import java.util.Collections;

public class War_Runner 
{
	private final int decks;
	private ArrayList<Card> cards;
	
	public War_Runner(int decks)
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
		{
			for(int value = 2; value <= 14; value++)
			{
				for(int x = 1; x <= decks; x++)
				{
					cards.add(new Card(suit, value));
					System.out.println(suit + value);
				}
					
			}	
		}
	}
	
	public static void main(String[] args)
	{	
		for(String suit : new String[]{"H", "D", "S", "C"})
		{
			for(int value = 2; value <= 14; value++)
			{
				for(int x = 1; x <= 1; x++)
				{
					System.out.println(suit + value);
				}
					
			}	
		}
	}
}
