package formativeController;

import formativeView.Frame;
import formativeModel.Winner;

public class Controller {
 private Frame baseFrame;
 private Winner calc;
	 
	 public Controller()
	 {
		 baseFrame = new Frame(this);
		 calc = new Winner();
	 }
	 
	 public void start()
	 {
		 
	 }
	 public void playerOneValues(int valOne)
	 {
		 int stuff1 = valOne;
		calc.playerOneValue(stuff1);
		
	 }
	 public void playerTwoValues(int valTwo)
	 {
		 int stuff2= valTwo;
		 calc.playerTwoValue(stuff2);
	 }
}
