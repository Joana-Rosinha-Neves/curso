import java.util.Scanner;

class Intervalos

{
    Scanner scannumero = new Scanner (System.in);
    Intervalos()
    {
        System.out.println ("indique um numemro");
        int numero = scannumero.nextInt();
        if (numero >25 && numero<50 )
        System.out.println(" está dentro do intervalo");
        
        
    }
}