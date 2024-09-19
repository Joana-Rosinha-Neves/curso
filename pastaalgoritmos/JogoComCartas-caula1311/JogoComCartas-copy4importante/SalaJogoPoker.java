import java.util.ArrayList;
import java.util.Random;

class SalaJogoPoker
{
    Jogador jogadorPoker;
    ArrayList<Jogador> listaJogadores;
    Carta instanciaCarta;
    int count= 0;
     ArrayList<Carta> baralho = new ArrayList<>();
     //AppJogoComCartas instanciaAPP = new AppJogoComCartas();
     Random valorAleatorio = new Random();
    
    SalaJogoPoker()
    {
        listaJogadores = new ArrayList<>();
        //count = AppJogoComCartas.valor;
    }
    void adicionarJogador()
    {
          count++;
        jogadorPoker = new Jogador(); 
        jogadorPoker.nomeNoJogo = "Player_" + count;
        
        listaJogadores.add(jogadorPoker);
        System.out.println("Entrou na sala o:" + jogadorPoker.nomeNoJogo);

        
    }
    void contarJogadores()
    {
        System.out.println("Existem " + listaJogadores.size() + " jogadores na sala ");
    }
    
    void jogadoressala()
    {
        if (listaJogadores.size() >0)
        {
     for (int i =0; i<listaJogadores.size(); i++)
     {
       
            
          System.out.println(listaJogadores.get(i).nomeNoJogo);
         
        
     }
    }
     else 
     {
     System.out.println("não há jogadores");
        }
}
void criarNovoBaralho()
{
    
                baralho= new ArrayList<>();
        for(int i=0; i < Carta.arrayNaipes.length; i++)
        {
            for(int j=0; j < Carta.arrayRanks.length; j++)
            {
                instanciaCarta = new Carta(i, j);
                
                baralho.add(instanciaCarta);
            }
        }
    System.out.println("um novo baralho foi colocado na mesa");
}
void flop()
{
    
  
    for (int i=0; i<3;i++) 
    {
    int indexAleatorio = valorAleatorio.nextInt(baralho.size());
    Carta cartaComprada = baralho.get(indexAleatorio);
    baralho.remove(indexAleatorio);
    System.out.println(cartaComprada.rank + "de" + cartaComprada.naipe);
    }

}
void todosJogadoresCompramumaCarta ()
{
 
        
     for (int i =0; i<listaJogadores.size(); i++)
     {
       
         //   int indexAleatorio = valorAleatorio.nextInt(baralho.size());
    //Carta cartaComprada = baralho.get(indexAleatorio);
    //baralho.remove(indexAleatorio);
    // Carta comprada = tirarCartadoBaralho();
          listaJogadores.get(i).comprarCarta(tirarCartadoBaralho());
        
     }
     System.out.println("todos os jogadores Compraram Carta");
}

private Carta tirarCartadoBaralho()
{
    
    int indexAleatorio = valorAleatorio.nextInt(baralho.size());
    Carta cartaComprada = baralho.get(indexAleatorio);
    baralho.remove(indexAleatorio);
    return cartaComprada;
}
}


