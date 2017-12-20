

public class Card21 implements Comparable <Card21>
{
   private final static int ACE   = 1;
   private final static int TWO   = 2;
   private final static int THREE = 3;
   private final static int FOUR  = 4;
   private final static int FIVE  = 5;
   private final static int SIX   = 6;
   private final static int SEVEN = 7;
   private final static int EIGHT = 8;
   private final static int NINE  = 9;
   private final static int TEN   = 10;
   private final static int JACK  = 11;
   private final static int QUEEN = 12;
   private final static int KING  = 13;

   private final static int CLUBS    = 1;
   private final static int DIAMONDS = 2;
   private final static int HEARTS   = 3;
   private final static int SPADES   = 4;

   private final static int NUM_FACES = 13;
   private final static int NUM_SUITS = 4;

   private int face, suit, searchVal;
   private String faceName, suitName, faceVal;


   public Card21 (int faceValue, int suitValue)
   {
 	 face = faceValue;
 	 setFaceName();

 	 suit = suitValue;
	 setSuitName();
 	 faceVal= ""+getFace();
   }

//-----------------------------------------------------------------
//  constructor Creates a card of the specified suit and face value.
//-----------------------------------------------------------------
   public Card21 (int faceValue, int suitValue, int searchValue)
   {
      face = faceValue;
      setFaceName();

      suit = suitValue;
      setSuitName();

      searchVal = searchValue;

      faceVal= ""+getFace();
   }

//-----------------------------------------------------------------
//  method: setFaceName
//  Sets the string representation of the face using its stored
//  numeric value.
//-----------------------------------------------------------------
	private void setFaceName()
	{
	  switch (face)
	  {
		 case ACE:
			faceName = "Ace";
			break;
		 case TWO:
			faceName = "Two";
			break;
		 case THREE:
			faceName = "Three";
			break;
		 case FOUR:
			faceName = "Four";
			break;
		 case FIVE:
			faceName = "Five";
			break;
		 case SIX:
			faceName = "Six";
			break;
		 case SEVEN:
			faceName = "Seven";
			break;
		 case EIGHT:
			faceName = "Eight";
			break;
		 case NINE:
			faceName = "Nine";
			break;
		 case TEN:
			faceName = "Ten";
			break;
		 case JACK:
			faceName = "Jack";
			break;
		 case QUEEN:
			faceName = "Queen";
			break;
		 case KING:
			faceName = "King";
			break;
	  }
	}

//-----------------------------------------------------------------
//  method: setSuitName
//  Sets the string representation of the suit using its stored
//  numeric value.
//-----------------------------------------------------------------
   private void setSuitName()
   {
      switch (suit)
      {
         case CLUBS:
            suitName = "Clubs";
            break;
         case DIAMONDS:
            suitName = "Diamonds";
            break;
         case HEARTS:
            suitName = "Hearts";
            break;
         case SPADES:
            suitName = "Spades";
            break;
      }
   }

//-----------------------------------------------------------------
//  method: isHigherThan
//  Determines if this card is higher than the passed card. The
//  second parameter determines if aces should be considered high
//  (beats a King) or low (lowest of all cards).  Uses the suit
//  if both cards have the same face.
//-----------------------------------------------------------------
   public boolean isHigherThan (Card card2, boolean aceHigh)
   {
      boolean result = false;

      if (face == card2.getFace())
      {
         if (suit > card2.getSuit())
            result = true;
      }
      else
      {
         if (aceHigh && face == ACE)
            result = true;
         else
            if (face > card2.getFace())
               result = true;
      }

      return result;
   }

//-----------------------------------------------------------------
//  Determines if this card is higher than the passed card,
//  assuming that aces should be considered high.
//-----------------------------------------------------------------
   public boolean isHigherThan (Card card2)
   {
      return isHigherThan (card2, true);
   }

//-----------------------------------------------------------------
//  Returns the face (numeric value) of this card.
//-----------------------------------------------------------------
   public int getFace ()
   {
	  if(face==10)
	  return 91;

	  else

	  if(face==11)
	  return 92;

	  else

	  if (face==12)
	  return 93;

	  else

	   if (face==13)
	  return 94;

	  else

	   if (face==1)
	  return 95;

	  else

      return face;
   }

//-----------------------------------------------------------------
//  Returns the suit (numeric value) of this card.
//-----------------------------------------------------------------
   public int getSuit ()
   {
      return suit;
   }
// returns the search value of card object
   public int getSearchVal()
   {
	   return searchVal;
   }

//-----------------------------------------------------------------
//  Returns the face (string value) of this card.
//-----------------------------------------------------------------
   public String getFaceName ()
   {
      return faceName;
   }

//-----------------------------------------------------------------
//  Returns the suit (string value) of this card.
//-----------------------------------------------------------------
   public String getSuitName ()
   {
      return suitName;
   }

//-----------------------------------------------------------------
//  Returns the string representation of this card, including
//  both face and suit.
//-----------------------------------------------------------------
   public String toString ()
   {
      return faceName + " of " + suitName;
   }

//-----------------------------------------------------------------
// compareTo method
//-----------------------------------------------------------------

   public int compareTo(Card21 other)
   {
	   int result;

	   if (suitName.equals(other.suitName))
	       result = faceVal.compareTo(other.faceVal);
	   else
	   		result = suitName.compareTo(other.suitName);

	   return result;
   }

}//end Card21
