import java.util.Scanner;

class Multiplos

{
    Scanner scanNumero = new Scanner (System.in);
   
    Multiplos()
    {
        System.out.println("diga numero inteiro");
        int numero = scanNumero.nextInt();
        System.out.println("diaga outro numero inteiro");
        int numero2 = scanNumero.nextInt();
        
        if (numero2>numero)
        {
        System.out.println(numero2 + numero);
        }
        else
        {
            System.out.println(numero + numero2);
            
        }
        if (numero2%numero==0 || numero%numero2 ==0)
        {
            System.out.println("sao multiplos entre si" );
            
        }
        else 
        {
            System.out.println("não sao multiplos");
        }
    }
}