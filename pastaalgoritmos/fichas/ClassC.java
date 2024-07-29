import java.util.Random;
import java.util.Scanner;



class ClassC
{
    
    Random numero= new Random();
    Scanner scanerpessoa = new Scanner(System.in);
    int i= 0;
            
    
    ClassC()
    {
        
        
        misterio();
    }
    void misterio()
        {
        
    i++;
    
    int numeroaleatorio = numero.nextInt(7)+2;  
    System.out.println("diga numero");
    int numero = scanerpessoa.nextInt();
    
                           
        
     
    if (numeroaleatorio == numero)
             {
                
               System.out.println("acertou" + i);
        
        
             }
    if (numeroaleatorio < numero)
             {
                 System.out.println("o valor é menor");
                 misterio();
                 
                  
             }
    if(numeroaleatorio > numero)
             {
                 System.out.println("o valor é menor");
                  misterio();
             }
}
}




