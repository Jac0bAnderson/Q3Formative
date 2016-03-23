package formativeView;

import formativeController.Controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;
import formativeModel.Winner;
public class Panel extends JPanel
{
private Winner pc;
private SpringLayout baseLayout;
private Controller baseController;

private JLabel playerOneLabel;
private JTextField playerOneInput;
private JLabel oneScore;

private JLabel playerTwoLabel;
private JTextField playerTwoInput;
private JLabel twoScore;

private JButton submit;

private JLabel compScore;
private JLabel controls;
private JCheckBox whosPlaying;
private JButton quitButton;

private int player1Win;
private int player1loss;
private int player2Win;
private int player2Loss;
private JLabel lastWin;
private boolean isbot;

public Panel(Controller baseController)
{
this.baseController = baseController;
baseLayout = new SpringLayout();

playerOneInput = new JTextField("",10);
playerOneInput.setForeground(Color.WHITE);

playerTwoInput = new JTextField("",10);
playerTwoInput.setForeground(Color.WHITE);
playerOneLabel = new JLabel("Player one");

playerTwoLabel = new JLabel("Player two");
controls = new JLabel("Rock: P1-A  p2-J Paper: P1-S or P2-K Scissors: P1-D or P2-L");


submit = new JButton("submit");
whosPlaying = new JCheckBox("Player vs Player?");


whosPlaying.setSelected(true);
player1Win = 0;
player1loss = 0;
player2Win = 0;
player2Loss = 0;

oneScore = new JLabel(+player1Win+  "/" + player1loss);

twoScore = new JLabel(+player2Win+ "/"+ player2Loss);

quitButton = new JButton("Exit");
lastWin = new JLabel("Rock Paper Scissors");
isbot = false;







setupPanel();
setupLayout();
setupListeners();

}

private void setupPanel()
{
	this.add(lastWin);
	this.add(quitButton);
	this.add(twoScore);
	this.add(oneScore);
	this.add(whosPlaying);
	this.add(submit);
	this.add(controls);
	this.add(playerTwoLabel);
	this.add(playerOneLabel);
	this.add(playerTwoInput);
	this.add(playerOneInput);
	this.setLayout(baseLayout);
	
}
private void setupLayout()
{
	baseLayout.putConstraint(SpringLayout.WEST, controls, 33, SpringLayout.WEST, this);
	baseLayout.putConstraint(SpringLayout.SOUTH, whosPlaying, -59, SpringLayout.NORTH, controls);
	baseLayout.putConstraint(SpringLayout.SOUTH, controls, -41, SpringLayout.NORTH, lastWin);
	baseLayout.putConstraint(SpringLayout.NORTH, lastWin, 0, SpringLayout.NORTH, twoScore);
	baseLayout.putConstraint(SpringLayout.WEST, lastWin, 70, SpringLayout.EAST, oneScore);
	baseLayout.putConstraint(SpringLayout.NORTH, quitButton, 10, SpringLayout.NORTH, this);
	baseLayout.putConstraint(SpringLayout.EAST, quitButton, 0, SpringLayout.EAST, this);
	baseLayout.putConstraint(SpringLayout.NORTH, oneScore, 0, SpringLayout.NORTH, twoScore);
	baseLayout.putConstraint(SpringLayout.SOUTH, twoScore, -6, SpringLayout.NORTH, playerTwoLabel);
	baseLayout.putConstraint(SpringLayout.EAST, twoScore, -68, SpringLayout.EAST, this);
	baseLayout.putConstraint(SpringLayout.WEST, oneScore, 61, SpringLayout.WEST, this);
	baseLayout.putConstraint(SpringLayout.EAST, whosPlaying, 0, SpringLayout.EAST, playerOneInput);
	baseLayout.putConstraint(SpringLayout.NORTH, submit, 1, SpringLayout.NORTH, playerTwoInput);
	baseLayout.putConstraint(SpringLayout.WEST, submit, 30, SpringLayout.EAST, playerOneInput);
	baseLayout.putConstraint(SpringLayout.WEST, playerOneLabel, 44, SpringLayout.WEST, this);
	baseLayout.putConstraint(SpringLayout.NORTH, playerOneLabel, 0, SpringLayout.NORTH, playerTwoLabel);
	baseLayout.putConstraint(SpringLayout.SOUTH, playerTwoLabel, -6, SpringLayout.NORTH, playerTwoInput);
	baseLayout.putConstraint(SpringLayout.EAST, playerTwoLabel, -46, SpringLayout.EAST, this);
	baseLayout.putConstraint(SpringLayout.WEST, playerOneInput, 10, SpringLayout.WEST, this);
	baseLayout.putConstraint(SpringLayout.NORTH, playerOneInput, 0, SpringLayout.NORTH, playerTwoInput);
	baseLayout.putConstraint(SpringLayout.SOUTH, playerTwoInput, -22, SpringLayout.SOUTH, this);
	baseLayout.putConstraint(SpringLayout.EAST, playerTwoInput, -10, SpringLayout.EAST, this);
}

private void setupListeners()
{
	submit.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent clickEvent)
		{
			
			player1Value();
		//	player2Value();
			//pc.compPlayer();
			
			
		}
	
	});
	quitButton.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent clickEvent)
		{
			System.exit(0);
		}
	
	});
}
public int player1Value()
{
	String p1Value = playerOneInput.getText();
	int p1value = 0;
	
	if(p1Value.equalsIgnoreCase("a"))
	{
		p1value = 1;
	}
	else if(p1Value.equalsIgnoreCase("s"))
	{
		p1value = 2;
	}
	else if (p1Value.equalsIgnoreCase("d"))
	{
		p1value = 3;
	}
	else if(! p1Value.equalsIgnoreCase("a") && ! p1Value.equalsIgnoreCase("s") && ! p1Value.equalsIgnoreCase("d"))
	{
		p1value = 1;
	}
	///
	
	String p2Value = playerTwoInput.getText();
	int p2value = 0;
	
	if(p2Value.equalsIgnoreCase("j"))
	{
		p2value = 1;
	}
	else if(p2Value.equalsIgnoreCase("k"))
	{
		p2value = 2;
	}
	else if (p2Value.equalsIgnoreCase("l"))
	{
		p2value = 3;
	}
	else if(! p2Value.equalsIgnoreCase("j") && ! p2Value.equalsIgnoreCase("k") && ! p2Value.equalsIgnoreCase("l"))
	{
		p2value = 1;
	}
	
	baseController.playerOneValues(p1value, p2value);
	return p1value;
}


public void winLoss(int winner) 
{
	int win = winner;
if(win == 300){
	lastWin.setText("Tie");
}
else if(win == 200){
	System.out.println("player2 wins");
	lastWin.setText("Player Two Wins");
	player1loss = 1+ player1loss;
	player2Win = 1+ player2Win;
	oneScore.setText(+player1Win+  "/" + player1loss);
	twoScore.setText(+player2Win+  "/" + player2Loss);
}
else if(win == 100){
	System.out.println("player1 wins");
	lastWin.setText("Player One Wins");
	player1Win = 1+ player1Win;
	player2Loss = 1+ player2Loss;
	oneScore.setText(+player1Win+  "/" + player1loss);
	twoScore.setText(+player2Win+  "/" + player2Loss);
}
else
{
	System.out.println("it didnt work:(");
}


}


}

