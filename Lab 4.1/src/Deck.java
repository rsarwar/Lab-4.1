import java.util.ArrayList;
public class Deck {

	private ArrayList<Card> unDealt;
	private ArrayList<Card> Dealt;

	public Deck(String[] ranks, String[] suits, int[] pointVals) 
	{
		//ArrayList<Card> cards = new ArrayList<Card>();
		for(int i = 0; i < ranks.length; i++)
		{
			for(int j = 0; j < suits.length; j++) 
			{
				for(int k = 0; k < pointVals.length; k++)
				{
					unDealt.add(new Card(ranks[i], suits[j], pointVals[k]));
				}
			}
		}
	}

	public boolean isEmpty(ArrayList<Card> deck)
	{
		if(deck.size() == 0)
		{
			return true;
		}
		return false;
	}
	
	public int size()
	{
		return unDealt.size();
	}
	
	public Card deal()
	{
		if(unDealt.isEmpty())
		{
			return null;
		}
		else
		{
			Card card1 = 
			unDealt.remove();
		}
	}
	public ArrayList<Card> shuffle()
	{
		ArrayList<Integer> shuffledDeck = new ArrayList<Integer>();
		
		
	}
	
	
}
