import java.util.Scanner;



class Impostos
{
    Scanner salarioscan = new Scanner (System.in);
    Impostos()
    {
       System.out.println("qual o seu salario");
       float salario = salarioscan.nextFloat();
       if (salario<=2000)
       {
       System.out.println(" está isento de imposto");
       
        }
        else if ( salario>2000 && salario<=3000)
        {
        
        double valortotal = (salario-2000)* 0.08f;
        System.out.println("o valor de imposto é" + valortotal);
        double valorareceber = salario-valortotal;
        System.out.println("o salario é"+ valorareceber);
        }
        else if (salario>3000 && salario < 4500)
        {
            double valortotal1 =(3000-2000)*0.08f ;
            double valototal2 =  (salario-3000-2000)*0.18f;
            double imposto = valortotal1 + valototal2;
            double sala = salario- (salario*imposto);
            
            System.out.println("o valor de imposto é" + imposto);
            System.out.println(" salario " + sala);
        }
        else
        {
            float valortotal1 =(3000-2000)*0.08f ;
            float valototal2 =  (4500-3000.01f)*0.18f;
            float valototal3 =(salario-4500)*0.28f;
            float  imposto = valortotal1 + valototal2+ valototal3;
    
            float sala = salario- (salario*imposto);
            
            System.out.println("o valor de imposto é" + imposto);
            System.out.println(" salario " + sala);
        }}}
        
        
        
        
        
        
        
        