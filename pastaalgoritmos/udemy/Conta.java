import java.util.Scanner;

class Conta
{
    Scanner scancodigo = new Scanner (System.in);
    Scanner scanquatidada = new Scanner (System.in);
    
    Conta()
    {
    System.out.println(" insira o codigo");
    int numerodecodigo = scancodigo.nextInt();
    System.out.println( " insira a quantidade ");
    int numeroquatidade = scanquatidada.nextInt();
    
    
        if  (numerodecodigo  == 1)
        {
        int preco = 4;
        int valor = preco* numeroquatidade;
        System.out.println(" o valor é " + valor );
        
        }
        else if (numerodecodigo == 2)
        {
        
        float preco2 = 4.5f;
        float valor = preco2 * numeroquatidade;
        System.out.println(" o valor é " + valor );
        
        }
        else if ( numerodecodigo == 3)
        {
        int preco3 = 5;
        int valor = preco3* numeroquatidade;
        System.out.println(" o valor é " + valor );
        }
        else 
        {
            int preco4 = 5;
            int valor = preco4* numeroquatidade;
            System.out.println(" o valor é " + valor );
        }
}
}
