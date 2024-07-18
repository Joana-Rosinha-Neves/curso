//importação de class que nos permite gerar numero aleatoria
import java.util.Random;
// importação da class que nos permite receber input do utilizador
import java.util.Scanner; 


class DadosAula3
{
    //variaveis globais de clase. talbem denominadas de propeidades ou atributos
    // para computador criar progrma que permite pessoas escreverem
    Scanner scanNumeroUtilizador= new Scanner(System.in);
    Random objetoNumeroAletatorio= new Random ();
    
    
    
    
    DadosAula3()
    {
      pedidoLancamento();  
     
    }
    
    void pedidoLancamento()
    {
       System.out.println("Bem-vindo/a ao Simulador de lançamentos");
          System.out.println("Este programa permite lançar dados de 4 dados ou 6 ou 8 lados");
       
        
        // guardar valor que o utlizador escreveu
        int  valorUtilizadorGuardado = scanNumeroUtilizador.nextInt();
        
        
        if( valorUtilizadorGuardado == 4 || valorUtilizadorGuardado==6 || valorUtilizadorGuardado==8)
        {
            escreveResultado(valorUtilizadorGuardado); // salta para função o parametro da funçao-
        }
        else
        { 
            pedidoLancamento2();
        } 
            
    
     
    }
    
    void pedidoLancamento2()
    {
            System.out.println("Não escolheu um genero de dados suportado");
            System.out.println("Por favor escrever 4 ou 6 ou 8 para determinar genero de dado a lançar");
            int  valorUtilizadorGuardado = scanNumeroUtilizador.nextInt();
            if ( valorUtilizadorGuardado == 4 || valorUtilizadorGuardado==6 || valorUtilizadorGuardado==8)
            {
             escreveResultado(valorUtilizadorGuardado);
            }
            else 
             {
             pedidoLancamento2();
            }
            }
    
    
    void escreveResultado(int generoDeDadoAlancar)//o nome diferente
    {
        int resultadoDoLancamento= objetoNumeroAletatorio.nextInt(generoDeDadoAlancar)+1;
        
        System.out.println("O resultado do lançamento foi: " + resultadoDoLancamento);
        
    
        }        
    
 }
    