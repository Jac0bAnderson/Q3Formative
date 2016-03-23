package formativeController;

import formativeView.Frame;
import formativeModel.Winner;

public class Controller {
 private Frame baseFrame;
 private Winner calc;
	 
	 public Controller()
	 {
		 baseFrame = new Frame(this);
	 }
	 
	 public void start()
	 {
		 
	 }
	 public void playerOneValues(int valOne)
	 {
		calc.playerOneValue(valOne);
		
	 }
	 public void playerTwoValues(int valTwo)
	 {
		 calc.playerTwoValue(valTwo);
	 }
}
