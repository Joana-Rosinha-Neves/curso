import java.util.Random;
import java.util.ArrayList;


class Appjogo
{
    Carta instanciaCarta;
    Random valorAleatorio= new Random();
    ArrayList<Carta> baralho = new ArrayList<>();
    
    Appjogo()
    {
      
      
    }
    void criarNovoBaralho()
    {
        for (int i=0;i<Carta.arraynaipes.length;i++)
        {
             for (int j=0; j<Carta.arrayrank.length;j++){
                    instanciaCarta = new Carta (i,j);
                    baralho.add(instanciaCarta);
                }
        }
    }

    void comprarCartas( int numeroDeCartasComprar)
    {
        for (int i=0;i<numeroDeCartasComprar;i++){
            int indexaleatorio = valorAleatorio.nextInt(baralho.size());
            System.out.println(baralho.get(indexaleatorio).naipe + "de" + baralho.get(indexaleatorio).rank);
            baralho.remove(indexaleatorio);
        }
    }
    void tirarumaCarta(){
        int naipeAleatorio = valorAleatorio.nextInt(4);
        int rankAleatorio = valorAleatorio.nextInt(13);
        instanciaCarta = new Carta(naipeAleatorio, rankAleatorio);
        System.out.println("baralhar e vai ser dada uma carta");
        System.out.println(instanciaCarta.rank + "de" + instanciaCarta.naipe);
    
    }
}