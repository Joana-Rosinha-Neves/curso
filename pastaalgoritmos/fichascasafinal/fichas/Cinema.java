import java.util.Scanner;





class Cinema
{
Scanner scanneridade = new Scanner (System.in);

Cinema()
{
    verificacaoIdade();
    
}
 void verificacaoIdade()
 {
     
     System.out.println("qual a sua idade ?");
    int idade = scanneridade.nextInt();
    
    if (idade < 18 )
    {
    System.out.println(" Proibida a entrada");
    }
    else
    System.out.println("permitida a entrada");
}
    
    
    
}
