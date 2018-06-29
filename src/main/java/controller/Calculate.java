package controller;

import Application.CalculatriceException;
import Application.ExceptionEnum;
import Application.Factorielle;

public class Calculate
{

    public static double calculate(double firstoperand, double secondOperand, char operationSigne) throws CalculatriceException {
        try
        {
            switch (operationSigne)
            {
                case '+':
                    return firstoperand + secondOperand;
                case '-':
                    return firstoperand - secondOperand;
                case '/':
                    if (secondOperand == 0)
                    {
                        throw new CalculatriceException(ExceptionEnum.DIVISION_BY_ZERO.getCode(), ExceptionEnum.DIVISION_BY_ZERO.getDefaultMessage());
                    }
                    return firstoperand / secondOperand;
                case '*':
                    return firstoperand * secondOperand;
                default:
                    return 0.0;
            }
        } catch (CalculatriceException e)
        {
            throw e;
        }
    }



    public static double calculate(double firstoperand) throws CalculatriceException {
        Factorielle factorielle = new Factorielle();
        return factorielle.factorielle((int) firstoperand);
    }

}
