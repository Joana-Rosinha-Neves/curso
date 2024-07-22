import java.util.Scanner;

class Aventura
{
    Scanner scanOpcaoUtilizador = new Scanner(System.in);
    Aventura()
    {
        historia();
    }
    void historia()
    {
       System.out.println("Era uma vez uma menina que estava na selva e tinha 4 opçoes, a selva, b rio, d mar e montanhas");
       System.out.println("Qual escolheria?");
        String opcao = scanOpcaoUtilizador.nextLine();
        if (opcao.equalsIgnoreCase("a"))
        {
        System.out.println("respira");
        }
        if (opcao.equals("b"))
        {
            System.out.println("caça");
        
        }
        if (opcao.equalsIgnoreCase("c"))
        {
        System.out.println("vive");
        }
        if (opcao.equalsIgnoreCase("d"))
        {
        System.out.println("corre");
        }
        
    
       
    
    }
}

