import java.util.Scanner;
// 

class ExemploA
{
    String username = "abs"; // string username = new string ()
    String password = new String("xyz");


    ExemploA()
    {
        if(username.equals("abs")==true  && password.equals("xyz")==true|| retornoBool()==true )
        {
            if(password.equals("xyz")==true)
            {
            System.out.println( "Username e pass correcto");
            
            }
        }
        else
        {
            System.out.println("alguma coisa falhou");
        
        }
        
        if(6>9 || 4==3 && 9>=0 || 3>=1 )
        {
            //o and faz primeiro que o ou. 
            
        }
        
    }
    boolean retornoBool()
    {
        return true; 
    }
}
