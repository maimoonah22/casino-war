package casino_war;

public class Card 
{
	private String suit;
	private int value;
	
	public Card(String suit, int value)
	{
		if(!suit.equals("D") && !suit.equals("H") &&
				!suit.equals("S") && !suit.equals("C"))
			throw new IllegalArgumentException("suit must be one of \"D\", \"H\", \"S\", \"C\"");

		if(! (7 <= value && value <= 14) )
			throw new IllegalArgumentException("value must be 7 - 14 (inclusive)");

		this.suit = suit;
		this.value = value;
	}
	
	public String getSuit()
	{
		return suit;
	}
	
	public int getValue()
	{  	
		return value;
	}
	
	public String toString()
	{
		if(value == 14)
			return "A" + getSuit();
		if(value == 11)
			return "J" + getSuit();
		if(value == 12)
			return "Q" + getSuit();
		if(value == 13)
			return "K" + getSuit();

		return getValue() + getSuit();
	}
}
