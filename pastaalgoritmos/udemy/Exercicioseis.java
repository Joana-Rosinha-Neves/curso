import java.util.Scanner;

class Exercicioseis
{
    Scanner scannumero = new Scanner ( System.in);
    
    Exercicioseis()
    {
        System.out.println("por favor diga um numero");
        int n = scannumero.nextInt();
        int i =1;
        for ( i = 1; i<=n ; i++)
        {
           if  (n %i ==0)
           {
               System.out.println(i);
           }
           
        }
    }
}