import java.util.Scanner;





class Total
{
    Scanner scanDiasUtilizador = new Scanner (System.in);
    Total()
    {
             numero();
           
        

        
    }
        void numero()
    {
        System.out.println(" por favor faculte um numero de dias");

       
       int numerodias = scanDiasUtilizador.nextInt();
       
       int numerominutos = numerodias * 1400;
       
       System.out.println(numerominutos);
       
    }
}
