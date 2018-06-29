package Application;
public class AppliCalculatrice
{
    public static void main(String[] args){
        /*float a = 1;
        float b = 0;

        Calculatrice ope = new Addition();
        Calculatrice ope2 = new Soustraction();
        Calculatrice ope3 = new Multiplication();
        Calculatrice ope4 =  new Division();*/

        IHM client = new Launcher(); 
        client.initialiser("FR");
        
        /*System.out.println("Additionner " + a + " + " + b + " : " + ope.executer(a,b));
        System.out.println("Soustraction " + a + " - " + b + " : " + ope2.executer(a,b));
        System.out.println("Multiplication " + a + " * " + b + " : " + ope3.executer(a,b));
        System.out.println("Division " + a + " / " + b + " : " + ope4.executer(a,b));*/
    }
}
