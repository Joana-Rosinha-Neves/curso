import java.util.Scanner;

class Coordenadas
{
    Scanner coordenadascan= new Scanner(System.in);
    Scanner coordenadascany= new Scanner(System.in);
    Coordenadas()
    {
        System.out.println("escreva as coordenadas de x");
        int x= coordenadascan.nextInt();
        System.out.println("escreva as coordenadas de y");
        int y = coordenadascany.nextInt();
        
        while(x!=0 && y!=0)
        {   
            if (x>0 && y>0)
            {
            System.out.println("esta no quadrante 1");
           
            }
            else if (x<0 && y>0)
            {
            System.out.println("esta no quadrante 4");
           
            }
             else if (x<0 && y<0)
            {
            System.out.println("esta no quadrante 3");
           
            }
            else
            {
            System.out.println("esta no quadrante 3");
            
            }
            System.out.println("escreva as coordenadas de x");
            x = coordenadascan.nextInt();
            System.out.println("escreva as coordenadas de y");
            y = coordenadascany.nextInt();
    
    
        
        
        
        
        
    }
    System.out.println();
}
}