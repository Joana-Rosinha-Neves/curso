import java.util.Scanner;

class Forexerciciodois
{
    Scanner numeroscan = new Scanner(System.in);
    Forexerciciodois()
    {
        System.out.println("leia um valor n");
        
        int contador=0;
        int contadorout=0;
        int numero = numeroscan.nextInt();
        for (int i = 1; i<=numero;i++)
        {
        System.out.println("insira um numero");
        int x = numeroscan.nextInt();
        if (x >=10 && x<=20)
        {
        contador++;
        }
        else
        {
          contadorout++; 
        }
}
System.out.println(contador + "in");
System.out.println(contadorout + "out");

}
}