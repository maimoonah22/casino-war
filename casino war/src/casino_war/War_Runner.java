package casino_war;

import java.util.ArrayList;
import java.util.Collections;

public class War_Runner 
{
	private static Shoe shoe;
	
	public War_Runner() 
	{
		shoe = new Shoe(1);
	}
	
	public static Shoe PrintShoe()
	{
		return shoe;
	}
	
	public static void main(String[] args)
	{
		String[] deck = new String[52];
		for(int i = 0; i < deck.length; i++)
		{
			deck[i] = shoe.dealCard();
		}
		System.out.print(deck);
	}
}
