

import java.util.Scanner;




class Aventura
{
Scanner scantexto = new Scanner(System.in);
String escritaUtilizador= new String();

    
    Aventura()
    
    {
        System.out.println( " A Joana está na selava perdida e tem que encontrar a saída da selva para sua sobrivivênvia, para isso tem 4 saídas, no norte é pela terra, no sul tem canoa no rio, No este tem gruta e no oeste tem cavalo" );
        System.out.println ( "Qual das opções escolheria, norte, sul, este, oeste?");
        funcao();
    }    
    void funcao()
    {
    String escritaUtilizador= new String();
    escritaUtilizador = scantexto.nextLine();
        
        if (escritaUtilizador.equalsIgnoreCase("norte") == true) 
        {
        System.out.println( "A joana consegue ver a saída no cimo da montanha e sobrevive");
        }
       
        if (escritaUtilizador.equalsIgnoreCase("sul") == true)
        {
            System.out.println ("A Joana morre na canoa com a corrente");
        }
        if  (escritaUtilizador.equalsIgnoreCase("este") == true)
        {
            System.out.println ("A Joana morre na gruta sem comida");
        }
        
        if  (escritaUtilizador.equalsIgnoreCase("oeste") == true)
        {
            System.out.println ("A Joana monta o cavalo e sobe a montanha avista a nova vila e sobrevive");
        
        }
    }
}
        
        
        
        
        
        
    
            
    
    

