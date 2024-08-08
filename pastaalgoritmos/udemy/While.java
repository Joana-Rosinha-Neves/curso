
import java.util.Scanner;

class While

{
    Scanner scanpass = new Scanner (System.in);
    While()
    {
        System.out.println("escreva a sua senha");
        int pass = scanpass.nextInt();
        
        
        
        while (pass != 2002)
        {
        System.out.println ("senha invalida");
        System.out.println("escreva a senhra certa");
       pass = scanpass.nextInt();
        
        
        }
    System.out.println("acesso aprovado");
    
}
}