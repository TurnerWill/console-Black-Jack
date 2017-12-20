
// classes used in this program BlackJackDriver.java, Card21.java, Deck21.java,  ArrayStack.java, Stack.java

import java.util.Random;
public class BlackJackDriver
{
  public static void main(String[] args)
  {
	char hit = 'y';
	char another = 'y';
	Card21 drawValue;
	int dealer1=0; int dealer2=0; int dealer3=0; int dealer4=0; int dealer5=0;//numeric values of cards drawn by dealer
	int player1=0;int player2=0; int player3=0; int player4=0; int player5=0;//numeric values of cards drawn by player
	int tally1=0;//dealer tally
	int tally2=0;//player tally

	while(another == 'y' || another=='Y')
	{
	  Deck21 check2 = new Deck21();
	  Deck21 temp = check2;
	  check2.shuffle();
	  System.out.println("\n\n");
	  greetMenu();

	//===================================================================================================================
	//dealer processing module: drawing of dealer's cards, up to 5 cards, computes values of drawn cards, outputs
	//							dealer' card values to screen
	//===================================================================================================================
      dealerDraw();

	  //=================
	  //dealer's 1st draw
	  //=================
	  drawValue = check2.getValue();
	  dealer1= drawValue.getFace();

	  if((dealer1 >= 91) && (dealer1 <= 94))
	  {
		dealer1=10;
	  }
	  else
	    if(dealer1==95)
	    {
	      dealer1=1;
	    }
	  System.out.println("\t"+drawValue+"\t\t\t"+dealer1);

	  //=====================
	  //dealer's second draw
	  //=====================
	  drawValue = check2.getValue();
	  Card21 hidden = drawValue;
	  dealer2= drawValue.getFace();

	  if((dealer2 >= 91) && (dealer2 <= 94))
	  {
		dealer2=10;
	  }
	  else
	    if(dealer2==95)
	    {
		  if(dealer1==10)
	      dealer2=11;
	      else
	      dealer2=1;
  	    }
	  System.out.println("\t???????????\t\t\t???????");
	  System.out.println("\n");
	  //===========================================================================================================
	  //player processing module: drawing of player's cards, up to 5 cards, computes values of drawn cards, outputs
	  //							player's card values to screen
	  //===========================================================================================================
	  playerDraw();

	  //player's 1st draw
	  drawValue = check2.getValue();
	  player1= drawValue.getFace();

	  if((player1 >= 91) && (player1 <= 94))
		player1=10;
	  else
	    if(player1==95)
		player1=1;
	    System.out.println("\t"+drawValue+"\t\t\t"+player1);

	  //player's 2nd draw
	  drawValue = check2.getValue();
	  player2= drawValue.getFace();

	  if((player2 >= 91) && (player2 <= 94))
	   	player2=10;
	  else
	    if(player2==95)
		player2=1;
	    System.out.println("\t"+drawValue+"\t\t\t"+player2);

	  System.out.print("\n\tDraw another? (y) to draw or (n) to stay: ");
	  hit = Keyboard.readChar();
	  if(hit == 'y' || hit == 'Y')
	  {
		System.out.print("\n");
		playerDraw();
	  	//=================
	  	//player's 3rd draw
	  	//=================
	  	if(!((player1==1 && player2 ==10)||(player1==10 && player2==1)))
	  	{
	     drawValue = check2.getValue();
	     player3= drawValue.getFace();

	     if((player3 >= 91) && (player3 <= 94))
	    	player3=10;
	     else
	       if(player3==95)
	    	 player3=1;
		 System.out.println("\t"+drawValue+"\t\t\t"+player3);
		 System.out.print("\n\tDraw another? (y) to draw or (n) to stay: ");
		  hit = Keyboard.readChar();
	     	if(hit == 'y' || hit == 'Y')
	   	 	{
				//================
				//player's 4th draw
		    	//=================
					  drawValue = check2.getValue();
					  player4= drawValue.getFace();

					  if((player4 >= 91) && (player4 <= 94))
						player4=10;
					  else
					     if(player4==95)
					  	   player4=1;
					  System.out.println("\t"+drawValue+"\t\t\t"+player4);
					  System.out.print("\n\tDraw another? (y) to draw or (n) to stay: ");
					  hit = Keyboard.readChar();

	     				if(hit == 'y' || hit == 'Y')
	     				{
							drawValue = check2.getValue();
							player5= drawValue.getFace();

							if((player5 >= 91) && (player5 <= 94))
							   player5=10;
							else
							  if(player5==95)
							    player5=1;
	  						System.out.println("\t"+drawValue+"\t\t\t"+player5);
	  						System.out.println();
						}

			}
  	  	}

 	   }
	  else
	  System.out.println();
	  System.out.println("\t---------------------------------------------------------");
	  System.out.println("\tDealer flips ??? and the card shows:   "+hidden+" "+dealer2);
	  System.out.println("\t---------------------------------------------------------");
	  dealerDraw();
	    //=====================
	  	  // dealer's third draw
	  	  //=====================
	  	 if(!((dealer1 + dealer2)>=16))
	  	  {
	  		if(!((dealer1==1 && dealer2 ==10)||(dealer1==10 && dealer2==1)))
	  		{
	  			drawValue = check2.getValue();
	  			dealer3= drawValue.getFace();

	  			if((dealer3 >= 91) && (dealer3 <= 94))
	  			  dealer3=10;
	  			else
	  			  if(dealer3==95)
	  			  {
	  				 if(((dealer1 + dealer2)<=9)|| ((dealer1 + dealer2)==10))
	  				   dealer3=11;
	  				 else
	  				   dealer3=1;
	  			  }
	  			System.out.println("\t"+drawValue+"\t\t\t"+dealer3);
	  		 }
	  	  }
	  	  else
	  	  if((dealer1 + dealer2)==21 ||((dealer1 + dealer2)==11))
	  	   dealer3=0;
	  	  else
	  	   dealer3=0;

	  	  //==================
	  	  //dealer's 4th draw
	  	  //==================
	  	  if((dealer1 + dealer2 + dealer3)<16)
	  	  {
	  		drawValue = check2.getValue();
	  		dealer4= drawValue.getFace();

	  		if((dealer4 >= 91) && (dealer4 <= 94))
	  			dealer4=10;
	  		else
	  		   if(dealer4==95)
	  		   {
	  			  if((dealer1+dealer2+dealer3)<= 10 )
	  			     dealer4 = 11;
	  			  else
	  			  	 dealer4 = 1;
	  		   }
	  		 System.out.println("\t"+drawValue+"\t\t\t"+dealer4);
	  	  }
	  	  else
	  	  dealer4=0;


	System.out.println();
	System.out.println("\t=========================================================");
	System.out.println("\tGame results:");
	System.out.println("\t=========================================================");
	System.out.println("\tCards remaining in deck: "+check2.deckSize());

	if((dealer1==1 && dealer2 ==10)||(dealer1==10 && dealer2==1))
	   tally1=21;
	else
	   tally1 = dealer1 + dealer2 + dealer3 + dealer4 + dealer5;

	if((player1==1 && player2 ==10)||(player1==10 && player2==1))
	   tally2=21;
	else
	   tally2= player1 + player2 + player3 + player4 + player5;
	System.out.println("\tDealer's score: "+tally1+"\t\t"+"Player's score: "+tally2);
	System.out.println();

	if(tally1>21)
	System.out.println("\tThe Dealer has busted, Player wins!");
	else

	if(((tally1<=21)&&(tally2<=21))&&(tally1==tally2))
	System.out.println("\tplayers PUSH");
	else

	if(((tally1<21)&&(tally2<21))&&(tally1<tally2))
	System.out.println("\tPlayer Wins!");
	else

	if(((tally1<21)&&(tally2<21))&&(tally1>tally2))
	System.out.println("\tThe Dealer Wins");
	else

	if((tally1<=21)&&(tally2>21))
	System.out.println("\tPlayer is bust, Dealer Wins");
	tally1=0;
	tally2=0;
	dealer1=0;dealer2=0;dealer3=0;dealer4=0;dealer5=0;
	player1=0;player2=0;player3=0;player4=0;player5=0;
	//check2.inorderStack(); (prints deck inorder)
	System.out.println();
	System.out.print("\tanother round? ");
	another = Keyboard.readChar();
	}//end while

  }// end main

	private static void greetMenu()
	{
		System.out.println("\t----------------------------------------------------------");
		System.out.println("\tBlack Jack: Dealer draws past 15, Aces are 1 or 11");
		System.out.println("\t	    Single Deck, Deck reshuffled for each round");
		System.out.println("\t----------------------------------------------------------");
		System.out.println("\n");
	}

	private static void dealerDraw()
	{
		System.out.println("\tDealer draws: ");
		System.out.println();
	}

	private static void playerDraw()
	{
		System.out.println("\tPlayer draws: ");
		System.out.println();
	}

} //end BlackJackDriver
