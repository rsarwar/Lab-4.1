
public class Card {
	
	private String rank;
	private String suit;
	private int pointValue;
	
	public Card(String rank, String suit, int pointValue) 
	{
		this.rank = rank;
		this.suit= suit;
		this.pointValue = pointValue;
	}
	
	public boolean equals(Card otherCard)
	{
		if(this.pointValue == otherCard.pointValue)
		{
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		String card = "";
		card += "This card has a rank of: " + this.rank + "Suit: " + this.suit + "Point Value: " + this.pointValue;
		return card;
	}

}
