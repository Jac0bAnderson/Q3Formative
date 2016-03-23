package formativeModel;

import formativeView.Panel;
public class Winner 
{
	private int playerOne;
	private int playerTwo;
	private Panel panel;
	public Winner()
	{
		panel = new Panel(null);
	}
public void playerOneValue(int valueOne, int valueTwo )
{
	playerOne = valueOne;
	playerTwo = valueTwo;
	System.out.println("player values: "+ playerOne + " and " + playerTwo);
	whoWon();
	//return playerOne;
}
//public int playerTwoValue(int valueTwo)
//{
	//playerTwo = valueTwo;
	//return playerTwo;
//}

public int compPlayer() 
{
int pcValue = (int) (Math.random()*4);	
return pcValue;
	
}
public int whoWon()
{
	System.out.println("WHOOOWON?");
	int winner = 0;
	if(playerOne == 1 && playerTwo == 1)
	{
		winner = 300;
	}
	
	else if(playerOne == 1 && playerTwo == 2)
	{
		winner = 200;
	}
	
	else if(playerOne == 1 && playerTwo == 3)
	{
		winner =100 ;
	}
	
	
	else if(playerOne == 2 && playerTwo == 1)
	{
		winner =100 ;
	}
	
	else if(playerOne == 2 && playerTwo == 2)
	{
		winner =300 ;
	}
	
	else if(playerOne == 2 && playerTwo == 3)
	{
		winner =200 ;
	}
	
	else if(playerOne == 3 && playerTwo == 1 )
	{
		winner =200 ;
	}
	
	else if(playerOne == 3 && playerTwo == 2 )
	{
		winner =100 ;
	}
	
	else if(playerOne == 3 && playerTwo == 3)
	{
		winner = 300;
	}
	System.out.println(winner);
	panel.winLoss(winner);
		return winner;
}



}
