import java.util.Scanner;

class Hora
{
Scanner scanhora = new Scanner (System.in);
    Hora()
    {
        System.out.println("diga a hora do jogo que começou");
        float horadojogoinicial = scanhora.nextFloat();
        System.out.println( " diga a que hora o jogo terminou");
        float horadojogoterminar = scanhora.nextFloat();
        
        if  (horadojogoterminar >  horadojogoinicial)
        {
        float duracacao= horadojogoterminar-horadojogoinicial;
        
        System.out.println (" a duraçao do jogo foi " + duracacao);
        
        
        }
        else 
        {
        float duracao2= 24-horadojogoinicial  + horadojogoterminar;
        System.out.println ( " a duracao do hojo é de " + duracao2);
        
    
    
        
    
    }
}
}
