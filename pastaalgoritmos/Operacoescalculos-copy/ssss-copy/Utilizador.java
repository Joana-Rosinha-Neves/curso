import java.util.Scanner;

class Utilizador
{
    Scanner scanUser = new Scanner(System.in);
    String User = new String();
    Scanner scanpassword = new Scanner (System.in);
    int contador = 0;
    Utilizador()
    
    {
        pass();
    }
        
    
    void pass()
    {
    System.out.println(" Qual o seu username");
    String User = scanUser.nextLine ();
    System.out.println("Qual a sua pass");
    String Pass = scanpassword.nextLine ();
    contador ++; 
        
    
    if ( User.equals ("utilizador" ) == true && Pass.equals ( "abz") ==true)
        { 
            System.out.println("autentificação completa");
        }
        
            
                if (contador >= 3)
        {
            
        System.out.println (" este computador será autodestruido em 5 segundos");
        }
        
        else
        {
        pass();
        }
    }
    }
    
        
        
        

        
        
    


    