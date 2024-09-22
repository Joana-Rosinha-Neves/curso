import java.util.ArrayList;
import java.util.Random;
class Euromilhoes 
{
     ArrayList <Integer> numerosgrellha;
     ArrayList <Integer> grelhaestrelas;
     Random numero = new Random();
    Euromilhoes()
    {
        int grelhanumeros= new ArrayList();
        int grelhaEstrelas= new ArrayList();
        // preencher a tombola (Arraylist) com numeros
        for (int i=0; i<50;i++)
        {
             grelhanumeros.add(i+1);
             
             
        }
        System.out.println("a grelha de numeros é"  );
        // ciclo para retirar o numero da tombola
        for (int i = 0; i<5;i++)
        {
            int indexSorte = numero.nextInt(grelhanumeros.size());
            System.out.println(grellhanumeros.get(indexSorte));
            grelhanumeros.remove(indexSorte);
            // ver na net o remove e depois o novo array
            
            
        }
        
        for (int i=0; i<12;i++)
        {
           
            grelhaestrela.add(i+1);
        }
         
         for (int i=0; i<2;i++)
        {
           
            int estrelaChave = numero.nextInt(grelhaestrela.size());
            System.out.println(grelhaestrelas.get(indexSorte));
            grelhanumeros.remove(indexSorte);
             
        }
    }
    
    
}
