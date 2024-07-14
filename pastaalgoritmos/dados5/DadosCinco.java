import java.util.Random;
class DadosCinco
{
    DadosCinco()
    {
        System.out.println(lancamento());
        System.out.println(lancamento());
        System.out.println(lancamento());
        System.out.println(lancamento());
        System.out.println(lancamento());
    }
    
    int lancamento()
    {
    Random numerosorte= new Random();
    int resultado = numerosorte.nextInt(5)+1;
    return resultado;
    }
}

