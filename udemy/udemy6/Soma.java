
import java.util.Scanner;
import java.util.Locale;

class Soma {
    Soma() {
        Locale.setDefault(Locale.US);
        System.out.println(digitar());
    }

    char digitar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite um número: ");
        String x = sc.next().charAt(0);
        sc.close(); // Fechar o Scanner após a leitura
        return x;
    }

 
   
}
