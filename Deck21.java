
import java.util.Random;

public class Deck21
{
	protected Card21[] j;
	protected Card21StackList y;

	public Deck21(int k)// k is number of cards in deck
	{
		j=new Card21[k];
		j=makeDeck();
	}

	public Deck21()
	{
		y = new Card21StackList();
		y = makeDeckStack();
	}

     private Card21StackList makeDeckStack()
	{
	   Card21StackList x = new Card21StackList();
	   x.push(new Card21 (1,1));x.push(new Card21 (2,1));x.push(new Card21 (3,1));x.push (new Card21 (4,1));x.push (new Card21 (5,1));
	   x.push (new Card21 (6,1));x.push (new Card21 (7,1));x.push(new Card21 (8,1));x.push(new Card21 (9,1));x.push(new Card21(10,1));
	   x.push(new Card21(11,1));x.push(new Card21(12,1));x.push(new Card21(13,1));x.push(new Card21(1,2));x.push(new Card21(2,2));
	   x.push(new Card21(3,2));x.push(new Card21(4,2));x.push(new Card21(5,2));x.push(new Card21(6,2));x.push(new Card21(7,2));
	   x.push(new Card21(8,2));x.push(new Card21(9,2));x.push(new Card21(10,2));x.push(new Card21(11,2));x.push(new Card21(12,2));
	   x.push(new Card21(13,2));x.push(new Card21(1,3));x.push(new Card21(2,3));x.push(new Card21(3,3));x.push(new Card21(4,3));
	   x.push(new Card21(5,3));x.push(new Card21(6,3));x.push(new Card21(7,3));x.push(new Card21(8,3));x.push(new Card21(9,3));
	   x.push(new Card21(10,3));x.push(new Card21(11,3));x.push(new Card21(12,3));x.push(new Card21(13,3));x.push(new Card21(1,4));
	   x.push(new Card21(2,4));x.push(new Card21(3,4));x.push(new Card21(4,4));x.push(new Card21(5,4));x.push(new Card21(6,4));
	   x.push(new Card21(7,4));x.push(new Card21(8,4));x.push(new Card21(9,4));x.push(new Card21(10,4));x.push(new Card21(11,4));
	   x.push(new Card21(12,4));x.push(new Card21(13,4));

	   return x;
	}

	private Card21[] makeDeck()
	{
	   Card21[] x =
	   {
		 new Card21 (1,1),new Card21 (2,1), new Card21 (3,1), new Card21 (4,1), new Card21 (5,1), new Card21 (6,1),
		 new Card21 (7,1), new Card21 (8,1), new Card21 (9,1), new Card21(10,1), new Card21(11,1), new Card21(12,1),
		 new Card21(13,1),new Card21(1,2), new Card21(2,2), new Card21(3,2), new Card21(4,2), new Card21(5,2),
		 new Card21(6,2),new Card21(7,2), new Card21(8,2), new Card21(9,2), new Card21(10,2), new Card21(11,2),
		 new Card21(12,2),new Card21(13,2),new Card21(1,3), new Card21(2,3), new Card21(3,3), new Card21(4,3),
		 new Card21(5,3), new Card21(6,3),new Card21(7,3), new Card21(8,3), new Card21(9,3), new Card21(10,3),
		 new Card21(11,3), new Card21(12,3),new Card21(13,3),new Card21(1,4), new Card21(2,4), new Card21(3,4),
		 new Card21(4,4), new Card21(5,4), new Card21(6,4), new Card21(7,4), new Card21(8,4), new Card21(9,4),
		 new Card21(10,4), new Card21(11,4), new Card21(12,4),new Card21(13,4)
	   };
	  return x;
	}

	protected Card21StackList shuffle()
	{
		Card21[] x = new Card21[52];
		int[] z = makeCounter();

		for(int i=0;i<52;i++)
		x[z[i]] = (Card21)y.pop();

		shuffleDeck(z);

		for(int i=0;i<52;i++)
		y.push(x[z[i]]);

		return y;
	}

	protected Card21 getValue()
	{
	  return (Card21)y.pop();
	}

	protected int deckSize() //number of card objects in stacklist
	{
		return y.size();
	}

	protected void inorderStack()
	{
		y = makeDeckStack();
		for(int i=0;i<52;i++)
		System.out.println( "\t "+y.pop());
	}

	protected void inorderValueAt(int x)
	{
		System.out.print(""+j[x]);
	}

	protected void inorderToScreen()
	{
		for(int i=0;i<52;i++)
		System.out.println( "\t "+j[i]);
	}

	protected int[] makeCounter() //instantiates int array with 52 elements
	{
		final int TOTAL =52;
		int [] x = new int [TOTAL];
		for(int b=0;b< x.length;b++)
		x[b]=b;

		return x;
	}

	protected void shuffleDeck(int[] k)
	{
		Random rnd= new Random();
		for(int i= k.length-1; i>0; i--)
		{
			int index = rnd.nextInt(i+1);
			int a = k[index];
			k[index] = k[i];
			k[i] = a;
		}
	}

	protected void shuffledToScreen(int[] k)
	{
		for(int i=0;i<52;i++)
		System.out.println( "\t "+j[k[i]]);
	}

	protected Card21 dealCard(int[] k, int p)
	{
		Card21 topcard=j[k[0+p]];
		return topcard;
	}

	protected void shuffledValueAt(int []k, int p)
	{
		System.out.print(""+j[k[p]]);
	}

}