
import java.util.Scanner;

class Forexercicio1
{
    Scanner numeroscan = new Scanner(System.in);
    
    Forexercicio1()
    {
        System.out.println("Insira um numero");
        
        int y = numeroscan.nextInt();
        for ( int i=1;i<=y;i++)
        {
      
        if (i % 2 != 0) {
	System.out.println(i);
			}
		}
		
        }
}
