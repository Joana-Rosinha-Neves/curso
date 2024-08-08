
import java.util.Scanner;

class ExerciciosSete 
{
    Scanner numeroscan = new Scanner (System.in);
    ExerciciosSete()
    {
        System.out.println(" Por favor insira o numero N");
        int n = numeroscan.nextInt();
        
        for (int i=1; i<=n; i++)
        {
        
        int quadrado = i*i;
        int cubo = i*i*i;
        System.out.println (" " + i + " "+  quadrado+ cubo);
        
        }
}
}