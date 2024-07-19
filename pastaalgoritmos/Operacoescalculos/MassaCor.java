
import java.util.Scanner;

class MassaCor
{
    MassaCor()
    {
        System.out.println("por favor o seu peso" );
        
        Scanner ScanNumeroDito = new Scanner(System.in);
        float valordado1= ScanNumeroDito.nextInt();
        System.out.println("por favor a sua altura");
        float valordado2= ScanNumeroDito.nextInt();
    
        float soma = valordado1 / ((valordado2 * valordado2));
        System.out.println("massa muscular" + soma);
        
        
}
}