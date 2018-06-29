package controller;

import Application.CalculatriceException;
import Application.Factorielle;

public class Calculate {
	
	public static double calculate(double firstoperand, double secondOperand, char operationSigne) throws CalculatriceException{
		switch (operationSigne) {
		case '+':
			return firstoperand+secondOperand;
		case '-':
			return firstoperand-secondOperand;
		case '/':
			return firstoperand/secondOperand;
		case '*':
			return firstoperand*secondOperand;	
		default:
			return 0.0;
		}
	}
	
	public static double calculate(double firstoperand) throws CalculatriceException{
		Factorielle factorielle = new Factorielle();
		return factorielle.factorielle((int) firstoperand);
	}

}
