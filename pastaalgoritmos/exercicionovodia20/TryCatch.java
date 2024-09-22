
import java.util.Scanner;

class TryCatch
{
    Scanner inputUtilizador = new Scanner(System.in);
    
    TryCatch()
    {
    try
        {
        System.out.println("por favor escreva um numero");
        int escritautilizador = inputUtilizador.nextInt();
    
    }
    catch( Exception e )
    {
        System.out.println("Voce nao escreveu um numero interio");
        inputUtilizador.nextLine();
    }
    
}
}
