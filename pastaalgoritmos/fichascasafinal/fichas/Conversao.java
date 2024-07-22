import java.util.Scanner;


class Conversao
{
Scanner scanEurosUtilizador = new Scanner(System.in);


   Conversao()
   {
       System.out.println(ConversaoReais());
   }
   float ConversaoReais()
   {
       System.out.println("Por favor faculte o numero em euros");
       float resultadoUtilizador = scanEurosUtilizador.nextFloat();
       float reais = resultadoUtilizador * 6.04f;
       return reais;
       
   }
}

