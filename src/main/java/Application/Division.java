package Application;
public class Division extends Calculatrice
{
    @Override
    public float executer(float a, float b) throws CalculatriceException {
        if(b == 0)
            throw new CalculatriceException(ExceptionEnum.DIVISION_BY_ZERO.getCode(), ExceptionEnum.DIVISION_BY_ZERO.getDefaultMessage() );

        return a / b;
    }
}
