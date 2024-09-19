//superclass ou class mae

class Utilizador 
{
    String username;
    String email;
    int id;
    String password;
    boolean autenticado = false;
    
    
    Utilizador()
    {
        username = "Visitante";
    }
    
    void fazerLogin(String paramUsername, String paramPassword )
    {
       // suponde um eventual acesso a bd
       
       username = "Grims";
       password = "1234";
       
       if  (!(username.equals(paramUsername)&& password.equals(paramPassword)))
       {
           System.out.println("esvreveu mal");
       }
       else 
       {
        System.out.println("escreveu bem");
        autenticado = true;
           
       }
    }
    
    void fazerLogout()
    {
        autenticado = false;
        
    }
    
    void fazerRegisto()
    {
        
    }
}
