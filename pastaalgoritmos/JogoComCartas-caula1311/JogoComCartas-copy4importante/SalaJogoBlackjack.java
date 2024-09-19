import java.util.ArrayList;
import java.util.Random;

class SalaJogoBlackjack extends SalaJogoPoker
{
    SalaJogoBlackjack()
    {
        
    }
    
    void criarNovoBralho()
    {
        baralho =new ArrayList <>();
        for (int b=0; b< 6; b++)
        
        {
             for(int i=0; i < Carta.arrayNaipes.length; i++)
            {
                for(int j=0; j < Carta.arrayRanks.length; j++)
                {
                instanciaCarta = new Carta(i, j);
                
                baralho.add(instanciaCarta);
               
                System.out.println(instanciaCarta.rank + "de" + instanciaCarta.naipe);
                }
            }
            
        }
        
        System.out.println(baralho.size());
    }
    
    void chamarFuncaoClasseMae()
    {
        super.criarNovoBaralho();
        // criarNovo sem super é a da class onde estou
    }
}
    
    
