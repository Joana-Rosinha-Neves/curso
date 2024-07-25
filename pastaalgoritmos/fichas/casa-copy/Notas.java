import java.util.Scanner;


class Notas 
{
    Scanner notascanner = new Scanner(System.in);
    int contador = 0;
    
    Notas()
    {
        
        
        mediadasnotas();
         
    }
    void mediadasnotas()
    {
        
       
        System.out.println ( " Por favor insira nota " );
        int notaUtilizador1 = notascanner.nextInt();
       int notaUtilizador2 = notascanner.nextInt();
       int notaUtilizador3 = notascanner.nextInt();
        int medias = (notaUtilizador1 + notaUtilizador2 + notaUtilizador3) / 3 ;
       
        if (contador == 3)
        {
            System.out.println ( " a média é igual a " +  medias);
        }
        
        
        if (contador < 3)
        {
            mediadasnotas();
            contador ++;
        }
       
        
    }
        
}        