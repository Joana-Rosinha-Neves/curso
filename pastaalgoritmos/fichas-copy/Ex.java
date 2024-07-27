
import java.util.Random;


class Ex
{
    Random numeroAleatorio = new Random();
    
    Ex()
    
    {
    int numero = numeroAleatorio.nextInt(41);
    
    System.out.println(" a temperatura é " + numero);
    
    if ((numero >= 0) && (numero <= 10))
    
{
    System.out.println( "Muito frio");
    
}
if (numero >=11 && numero <= 20 ) 
    
{
    System.out.println( "temperaturamoderada");
    
}

if (numero >=21 && numero <= 30 ) 
    
{
    System.out.println( "está quente");
    
}
if (numero >=31 && numero <= 40 ) 
    
{
    System.out.println("está calor dos diabos");
    
}

    }
}
