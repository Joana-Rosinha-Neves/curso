import java.util.Scanner;
import java.util.Random;


class Dados
{
Scanner scanNumerodadoPessoa = new Scanner(System.in);

Random dado1aleatorio = new Random();
Random dado2aleatorio = new Random ();


    Dados ()
    {
        lancamento ();
        

    }
    void lancamento ()
    {
    System.out.println("Qual o número que irá sair no lançamento de 2 dados, o mínimo só poderá sair 2 e que no máximo só poderá ser 12");
    System.out.println("O mínimo só poderá ser 2 e o máximo só poderá ser 12");
    int dado1 = dado1aleatorio.nextInt(5)+1;
    int dado2 = dado2aleatorio.nextInt(5)+1;
    int numeroPessoa = scanNumerodadoPessoa.nextInt();
    System.out.println("o seu valor é " + numeroPessoa);
    
  
    if (numeroPessoa <2 ||numeroPessoa >12)
    {
        System.out.println("voltar a lançar");
        lancamento();
        
    }
    else 
    {
    System.out.println ("valor que saiu é dado1 " + dado1);
    System.out.println ("o valor que saiu do dado2 " + dado2);
          int resultado = dado1 + dado2;
    System.out.println ( "A soma dos dois dados é "+ resultado);
    fim(resultado, numeroPessoa);

    }
}
    void fim(int soma,int utilizador)
    {
        
    if (soma == utilizador)
    {
    System.out.println ("ganhou");
    }
    else
    { 
        System.out.println ("perdeu");
        
    }
}
}  

    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    

    

