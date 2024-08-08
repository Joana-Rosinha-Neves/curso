import java.util.Scanner;

class Forexercicioquatro
{
    Scanner numero = new Scanner (System.in);
    Forexercicioquatro()
    {
        System.out.println("diga o numero n");
        double y=0;
       
        int n = numero.nextInt();
        for ( int i =1 ; i<=n;i++)
        {
             int fatorial=1;
             int fat= fatorial * i;
            System.out.println("factorial");
            
        }
        
        
        
    }
}
