
import java.util.ArrayList;
import java.util.Random;



class Euromilho
{
    ArrayList<Integer> numeros;
    ArrayList<Integer> estrelas;
    Random numeroaleatorio = new Random();
    Euromilho()
    {
        numeros = new ArrayList();
        
        for (int j=1; j<51; j++)
        {
            numeros.add(j);
            
            
        }
        System.out.println(numeros);
        for (int i =0; i<5; i++)
        {
            int valoraleatorio = numeroaleatorio.nextInt(numeros.size());

            numeros.get(valoraleatorio);
            System.out.println(numeros.get(valoraleatorio));
            numeros.remove(valoraleatorio);
            

            
            
            
        }
                System.out.println(numeros);
        estrelas = new ArrayList();
        for (int i = 1; i<13; i++)
         {
             estrelas.add(i);
             
         }
        
        for (int i=1; i<3; i++)

                {
                int valoraleatorio = numeroaleatorio.nextInt(estrelas.size());
                 estrelas.get(valoraleatorio);
                 System.out.println(estrelas.get(valoraleatorio));
                estrelas.remove(valoraleatorio);
                 
                }
                System.out.println(estrelas);
}
}
    
    

