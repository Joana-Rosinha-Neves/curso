class ExemplosA
{
    String username = new String("abc");
    String password = new String("xyz");
    
    ExemplosA()
    {
    
        if( username.equals("abc") == true && password.equals("xyp") == true)
        {
            System.out.println("Username e Pass Correctas!");

        }
        else
        {
            System.out.println("Alguma coisa falhou!");
        }
        
        
        
        if( 6>9 || 4==3 && (9<=0 || 3>=1) || retornoBool() == true )
        {
            System.out.println("Aprendizagem sobre precedência do &&!");
        }
        
        
    }
    
    boolean retornoBool()
    {
        return true;
    }
    
    
}