
import java.util.Scanner;
class Soma
{
    Soma()
    {
        
        System.out.println (digitar());

        
    }
    
    double digitar()
    {
    Scanner sc= new Scanner(System.in);
    System.out.print("Por favor, digite algo: ");
     double x = sc.nextDouble();
    sc.close();
    return  x;
    }
}

    
       