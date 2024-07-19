import java.util.Scanner;

class Udemy
{
      Scanner scanNumero = new Scanner(System.in);
    
    Udemy()
    {
    System.out.println("introduza um numero");
    numero();
    
    }
    
    void numero()
    {
       int valorUtlizadorGuardado=scanNumero.nextInt();

        if (valorUtlizadorGuardado  % 2 == 0 )
        {
        System.out.println("o numero é par");
        
        }
        else 
        {
            
        System.out.println(" o numero é impar" );
        
        }
    }
}
