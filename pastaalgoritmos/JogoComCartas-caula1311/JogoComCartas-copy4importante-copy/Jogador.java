import java.util.ArrayList;

// extends é uma keyword que implementa conceito de herança.
//subclass de utlizador
class Jogador extends Utilizador

{
    int pontos;
    String nomeNoJogo;
    Carta cartaDoJogador;
    ArrayList<Carta> cartasNaMao;
    
    
    Jogador ()
    {
        cartasNaMao = new ArrayList();
    }
    void comprarCarta(Carta paramCarta)
    {
        cartasNaMao.add(paramCarta);
    }
    void descartarCarta()
    {
        
    }
    void mostrarMao()
    {
        
    }
    
}