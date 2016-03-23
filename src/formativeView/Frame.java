package formativeView;

import javax.swing.JFrame;
import formativeController.Controller;

public class Frame extends JFrame
{
private Panel basePanel;
private Controller baseController;

public Frame(Controller baseController)
{
	this.baseController = baseController;
	basePanel = new Panel(baseController);
	setupFrame();
}
private void setupFrame()
{
	this.setContentPane(basePanel);
	this.setSize(450, 450);
	this.setResizable(false);
	this.setTitle("Rock Paper Scissors");
	this.setVisible(true);
}
}
