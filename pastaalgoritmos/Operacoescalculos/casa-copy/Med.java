
import java.util.Scanner;

class Med
{
    Scanner scannotas = new Scanner(System.in);
    
    
    Med()
    {
        media();
    }
    void media()
       {
        System.out.println("insira as sua nota 1");
        float notas1 = scannotas.nextFloat();
        
        System.out.println("insira a sua nota 2");
        float notas2 = scannotas.nextFloat();
        
        System.out.println("insira a sua nota 3");
        float  notas3 = scannotas.nextFloat();
        
        float resultado = ((notas1 + notas2 + notas3)/3);
        
        System.out.println("a média é" + resultado);
        
    
        
        
    }
}
