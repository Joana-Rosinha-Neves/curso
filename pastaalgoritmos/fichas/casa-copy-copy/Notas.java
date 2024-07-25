import java.util.Scanner;


class Notas 
{
    Scanner notascanner = new Scanner(System.in);
    
   
    
    Notas()
    {
        
        mediadasnotas();
      
       
       
       
    
        
         
    }
    void mediadasnotas()
    {
        
           System.out.println ( " Por favor insira nota1 " );
           int notaUtilizador1 = notascanner.nextInt();
          System.out.println ( " Por favor insira nota1 " );
           int notaUtilizador2 = notascanner.nextInt();
           System.out.println ( " Por favor insira nota1 " );
           int notaUtilizador3= notascanner.nextInt();
           
           
           int media = (notaUtilizador1  + notaUtilizador2+ notaUtilizador3)/ 3;
            System.out.println (" a média é " + media);
          
       }
            
       }
    

