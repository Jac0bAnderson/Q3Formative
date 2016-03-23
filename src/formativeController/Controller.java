import formativeView.Frame;
import formativeModel.Winner;

public class Controller {
 private Frame baseFrame;
 private Winner calc;
 private int stuff1;
 private int stuff2;
	 public Controller()
	 {
		 baseFrame = new Frame(this);
		 calc = new Winner();
	 }
	 
	 public void start()
	 {
		 
	 }
	 public void playerTwoValues(int valTwo)
	 {
		 // stuff2= valTwo;
		//  System.out.println("playervalue:"+stuff2);
		//  return stuff2;
		
			// calc.playerTwoValue(stuff2);
		 }
	 
	public void playerOneValues(int p1value, int p2value) {
		
		  stuff1 = p1value;
			 stuff2 = p2value;
			 playersValue();
			 // return stuff1;
	}
	public void playersValue()
	 {
		 calc.playerOneValue(stuff1, stuff2);	
		 
		 }

}
