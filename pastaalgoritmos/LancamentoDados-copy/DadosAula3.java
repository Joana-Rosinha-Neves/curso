//importação de class que nos permite gerar numero aleatoria
import java.util.Random;
// importação da class que nos permite receber input do utilizador
import java.util.Scanner; 


class DadosAula3
{
    //variaveis globais de clase. talbem denominadas de propeidades ou atributos
    // para computador criar progrma que permite pessoas escreverem
    Scanner scanNumeroUtilizador= new Scanner(System.in);
    
    
    
    
    DadosAula3()
    {
      pedidoLancamento();  
      
    }
    
    void pedidoLancamento()
    {
        System.out.println("Bem-vindo/a ao Simulador de lançamentos");
        System.out.println("Este programa permite lançar dados de 4 dados e de 6 lados");
        System.out.println("Por favor escrever 4 ou 6 para determinar genero de dado a lançar");
        // para ter o dado que pessoas escrevem.
        int  valorUtilizadorGuardado = scanNumeroUtilizador.nextInt();
        
        
    
    }
    
}