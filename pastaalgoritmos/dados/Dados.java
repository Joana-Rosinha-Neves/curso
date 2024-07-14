
import java.util.Random;
class Dados
{
    Dados()
    {
    System.out.println(lancardado());
    }
    int lancardado()
    {
    Random numeroaleatorio= new Random();
    int resultadododado=numeroaleatorio.nextInt(6)+1;
    return resultadododado;
    }

    
}

    
    
    
    
    
    
