package Application;

import java.util.Scanner;

public class Launcher implements IHM{

	private Scanner sc;

	@Override
	public void initialiser(String lang) {
//		ApplicationProperties ap = null;
		String operation;
		float op1, op2;
		sc = new Scanner(System.in);

		Calculatrice plus = new Addition();
		Calculatrice moins = new Soustraction();
		Calculatrice fois = new Multiplication();
		Calculatrice div =  new Division();
		
//		if (lang.contains("FR")) {
//			ap = new ApplicationProperties("./src/Utils/translation_fr.properties");
//		} else {
//			ap = new ApplicationProperties("./src/Utils/translation_en.properties");
//		}
//

while (true) {
	System.out.print("Entrez une op�ration, ex: +,-,/,* : ");
	operation = sc.next();
	if (operation.equals("q")) {
		break;
	}
	System.out.print("Entrez une op�rande #1 : ");
	op1 = sc.nextFloat();
	System.out.print("Entrez une op�rande #2 : ");
	op2 = sc.nextFloat();
	
	float res=-1;
	switch (operation) {
	case "+":
		try {
		res = plus.executer(op1, op2);
		}catch(CalculatriceException e) {
			System.out.println(ExceptionEnum.getDefaultMessageByCode(e.getCode()));
		}
		break;
	case "-":
		try {
		res = moins.executer(op1, op2);
		}catch(CalculatriceException e) {
			
			System.out.println(ExceptionEnum.getDefaultMessageByCode(e.getCode())); 
			//System.out.println(ap.readProperty("DIVIDED_BY_ZERO"));
			//System.out.println(ap.readProperty("DIVIDED_BY_ZERO"));
		}
		break;	
	case "*":
		try {
		res = fois.executer(op1, op2);
		}catch(CalculatriceException e) {
			System.out.println(ExceptionEnum.getDefaultMessageByCode(e.getCode()));
		}
		break;	
	case "/":
		try {
		res = div.executer(op1, op2);
		}catch(CalculatriceException e) {
			System.out.println(ExceptionEnum.getDefaultMessageByCode(e.getCode()));
		}
		break;
	default:
		break;
	}	
	

	System.out.print(" = "+res);
	System.out.println("");
		}
		
	}

}
