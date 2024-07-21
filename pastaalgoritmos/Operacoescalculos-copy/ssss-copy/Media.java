import java.util.Scanner;
class Media
{
    int contador=0;
    Scanner notadita= new Scanner(System.in);
    
    
    
    Media()
    {
       if(contador <= 3 )
       {
       calculo();
        }
    }
    void calculo()
    {
        
        System.out.println("Por indique a sua nota?");
        int nota1 = notadita.nextInt();
        System.out.println ("Por favor indique a sua nota");
        contador ++;
        int nota2 = notadita.nextInt();
        System.out.println ("Por favor indique a sua nota");
        int nota3 = notadita.nextInt();
        
        int mediautilizador =  (nota1+  nota1 + nota3)/3;
       
            System.out.println(" a média é"+ mediautilizador);
    }
    }


    

