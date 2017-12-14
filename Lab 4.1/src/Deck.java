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
					unDealt.add(Card);
				}
			}
		}
	}

	public boolean isEmpty()
	{
		if(unDealt.size() == 0)
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
		
	}
	
	
}
