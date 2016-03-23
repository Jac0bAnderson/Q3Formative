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
controls = new JLabel("Rock: A or J Paper: S or K Scissors: D or L");

submit = new JButton("submit");
whosPlaying = new JCheckBox("Player vs Player?");
baseLayout.putConstraint(SpringLayout.SOUTH, whosPlaying, -56, SpringLayout.NORTH, controls);
baseLayout.putConstraint(SpringLayout.EAST, whosPlaying, 0, SpringLayout.EAST, playerOneInput);
whosPlaying.setSelected(true);
oneScore = new JLabel("0/0");
twoScore = new JLabel("0/0");



setupPanel();
setupLayout();
setupListeners();

}

private void setupPanel()
{
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
	baseLayout.putConstraint(SpringLayout.NORTH, submit, 1, SpringLayout.NORTH, playerTwoInput);
	baseLayout.putConstraint(SpringLayout.WEST, submit, 30, SpringLayout.EAST, playerOneInput);
	baseLayout.putConstraint(SpringLayout.SOUTH, controls, -66, SpringLayout.NORTH, playerTwoLabel);
	baseLayout.putConstraint(SpringLayout.EAST, controls, -94, SpringLayout.EAST, this);
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
			player2Value();
			//pc.compPlayer();
			
			
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
	baseController.playerOneValues(p1value);
	return p1value;
}
public int player2Value()
{
	String p2Value = playerTwoInput.getText();
	int p2value = 0;
	
	if(p2Value.equalsIgnoreCase("a"))
	{
		p2value = 1;
	}
	else if(p2Value.equalsIgnoreCase("s"))
	{
		p2value = 2;
	}
	else if (p2Value.equalsIgnoreCase("d"))
	{
		p2value = 3;
	}
	else if(! p2Value.equalsIgnoreCase("a") && ! p2Value.equalsIgnoreCase("s") && ! p2Value.equalsIgnoreCase("d"))
	{
		p2value = 1;
	}
	baseController.playerTwoValues(p2value);
	return p2value;
}


}