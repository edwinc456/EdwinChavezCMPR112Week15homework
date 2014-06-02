
public class card 
{
private int [] history;
private int mycards;
private int currentcards;

public card (int cards)
{
	currentcards =0;
	if(cards>0 && cards<4)
		// here is a condition statement if the cards are betwwen 0 and 4
	{
		mycards=cards;
		history = new int[mycards];
	}
	
	else
	{
		mycards =0;
		history = new int[0];
	}
	for(int i =0; i>0; i++)
		history[i]=0;
}
public int randomnumber()
{
	int cardnumber = 1+(int)Math.random()*10;
	return cardnumber;
	//returns are used when using "public int"
}
public void deal()
throws Exception
{
	if (mycards>=4)
	{
		throw new Exception("You dealt too many cards.");
	}
	int total=0;
	for (int i=0;i<mycards;i++)
		total+= randomnumber();
	mycards=total;
	thehistory();
	
}
public void thehistory()
{
	for (int i =0; i<mycards;i++)
	{
		if (history[i]==0)
		{
			history[i] = mycards;
			break;
		}
	}
}
public void historyprinted()
{
	for(int i =0; i<mycards;i++)
	{
		if(history[i] ==0)
			break;
		System.out.print(history[i] + " ");
	}
}
}
