import java.util.Scanner;

class Combustivel

{
    Scanner scanCodito = new Scanner (System.in);
    Combustivel()
    {
        exercicio();
    }
    void exercicio()
    {
       System.out.println("insira um codigo");
       int codigoUtilizador = scanCodito.nextInt();
       int alcool = 0;
	int gasolina = 0;
	int diesel = 0;
		
       
       while (codigoUtilizador != 4)
       {
        if (codigoUtilizador ==1)
          
           {
               System.out.println("Alcool");
               alcool = alcool +1;
           }
        if (codigoUtilizador ==2)
           {
           System.out.println("gasolina");
           gasolina = gasolina +1;

       
            }
        if (codigoUtilizador ==3)
            {
             System.out.println("diesel");
          diesel = diesel +1;

            }
      
       
        System.out.println("Por favor insira novo codigo");
         codigoUtilizador = scanCodito.nextInt();
         
        }
        System.out.println(" muito obrigada");
        System.out.println("alcool"+alcool);
        System.out.println("diesel" + diesel);
        System.out.println("gasolina" + gasolina);
       
        }
}
