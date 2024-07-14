import java.util.Locale;
class Udemy
{
   Udemy()
   {
   System.out.println("hello world");
   String nome= "Maria";
   int idade=31;
   double renta = 40000.00;
   
   int x=32;
   System.out.println(32);
   double y=10.35785;
   System.out.printf("%.2f%n",y);
   Locale.setDefault(Locale.US);
   System.out.printf("%.2f%n",y);
   System.out.println("Resultado= " + x + "metros");
   System.out.printf("Resultado=%.2f metros%n",y);
   System.out.println( "A"+ nome +"tem"+ idade + "ganha" + renta);
   System.out.printf("%s tem %d anos e ganha €%.2f euros%n", nome, idade, renta);
   }

}    
