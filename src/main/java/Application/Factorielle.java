package Application;

public class Factorielle  extends Calculatrice{
	
	public int factorielle(int a) {
		  int fact = 1;
	        for (int i = 2; i <= a; i++) {
	            fact *= i;
	        }
	        return fact;
	 };
}
