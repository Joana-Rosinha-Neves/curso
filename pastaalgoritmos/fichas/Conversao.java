import java.util.Scanner;

class Conversao
{
    Conversao()
    {
        System.out.println("por favor indique o valor em euros" );
        Scanner ScanNumeroDito =new Scanner(System.in);
        float valordado= ScanNumeroDito.nextFloat();
        float valorReais= valordado * 6.04f;
        System.out.println("o valor em reais é"+valorReais);
        
        
    
            
    
}
}
