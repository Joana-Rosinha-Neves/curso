import java.util.Scanner;
// Pedir ao utilizador que escreva a palavra para username e em seguida a palavra para a 


 
class Username
{
    
Scanner scanTexto = new Scanner(System.in);
Scanner scanPassword= new Scanner(System.in);
int contador = 0;


        Username ()
        {
         
        inicio();
            

        }
        
        
                
        
    
        void inicio()
        
        {
           if  (contador == 3)
        {
            System.out.println ("Excedeu as 3 vezes");
            return ;
        } 
        else
        {
        
        System.out.println( "Qual o seu usernmane");
        String utilizador = scanTexto.nextLine();
        System.out.println ( "Qual a sua password");
        String password = scanPassword.nextLine();
    
            if (utilizador.equalsIgnoreCase("utilizador") == true && password.equalsIgnoreCase("abz")== true) 
        {
            System.out.println("Autentificação completa");
        }
            else 
        {
            System.out.println ("Autentificação inválida");
            contador++;
            inicio();
        }
            
  
    }

}
}
   
    
   