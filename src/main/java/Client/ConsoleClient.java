package Client;

import java.util.Scanner;

import Application.CalculatriceException;
import Application.ExceptionEnum;
//import Utils.ApplicationProperties;
import controller.Calculate;

public class ConsoleClient implements IIHM {

	@Override
	public void launch(String lang) throws CalculatriceException {
//		ApplicationProperties ap;
//
//		if (lang.contains("FR")) {
//			ap = new ApplicationProperties("/src/Utils/translation_fr.properties");
//		} else {
//			ap = new ApplicationProperties("/src/Utils/translation_en.properties");
//		}
		
		Double result;
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Operations (+,-,*,/) : ");
			char operation = sc.next().charAt(0);
			System.out.println("Operand 1 : ");
			Double operand1 = sc.nextDouble();
			System.out.println("Operand 2 : ");
			Double operand2 = sc.nextDouble();
			
			try {
				result = Calculate.calculate(operand1,operand2,operation);
				System.out.println("result : " + result);
			} finally {
				System.out.println("nothing");
			}
		}
		
	}

}
