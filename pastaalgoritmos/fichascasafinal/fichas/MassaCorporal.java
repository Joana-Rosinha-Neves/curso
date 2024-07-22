import java.util.Scanner;



class MassaCorporal
{
    Scanner scanPesoutilizador = new Scanner(System.in);
    Scanner ScanAltura = new Scanner(System.in);

    
    MassaCorporal() 
    {
        System.out.println(resultadoMassa());
    }
    
        float resultadoMassa()
        {
        System.out.println (" Qual o seu peso ?");
        float peso = scanPesoutilizador.nextFloat();
        System.out.println (" Qual a sua altura ? ");
        float altura = ScanAltura.nextFloat();
        
        float resultado = peso / (altura * altura);
        
        return resultado;
        
        
        
        
        
        
    }
}