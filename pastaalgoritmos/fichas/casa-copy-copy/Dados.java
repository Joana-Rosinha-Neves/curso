import java.util.Random;
import java.util.Scanner;

class Dados 
{
    Random numeroAleatorio = new Random();
    Scanner numeroUtilizador = new Scanner (System.in);
    
    Dados ()
    {
        lancamento ();
    }
    
    void lancamento()
        {
        System.out.println("qual o numero que irá sair no lancamento dos dado, sendo que no minimo so poderá sair 2 e no maximo so pode sair 12");
        int numeroTipodeDado = numeroUtilizador.nextInt();
        
        
        if (numeroTipodeDado >= 2 && numeroTipodeDado <=12)
        {
        System.out.println ("o numero do dado facultado" + numeroTipodeDado); 
        dados(numeroTipodeDado);
        }
        else
        {
            lancamento();
        }
        }
        void dados(int numeroTipodeDado)
        
        {
             int numeroDado1 = numeroAleatorio.nextInt(6)+1;
        System.out.println("o valor do dado1 é" + numeroDado1);
        int numeroDado2 = numeroAleatorio.nextInt(6)+1;
        System.out.println ("o valor do dado2 é" + numeroDado2);
        
        
        int soma = numeroDado1+ numeroDado2;
        System.out.println (" o resultado da soma dos dois dados é " + soma);
        
        if (numeroTipodeDado == soma)
        {
        System.out.println("ganhou 100 euros");
        }
        else
        {
        System.out.println ("Tem de pagar 10 euros");
        }
    
        }
    
    }
    
    
-


