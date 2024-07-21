import java.util.Scanner;

class Idade
{
    Idade()
    {
        System.out.println("por favor forneça a idade" );
        Scanner ScanNumeroDito =new Scanner(System.in);
        int valordado= ScanNumeroDito.nextInt();
    
            if (valordado <18 )
            {
            System.out.println("Proibido Entrar!");
            } 
            else
            {
            System.out.println("Permitida a Entrada"); 
            }
    
    
}
}