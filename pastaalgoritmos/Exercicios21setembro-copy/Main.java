import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Euromilho {
    ArrayList<Integer> numerosSorteados;
    ArrayList<Integer> estrelasSorteadas;
    ArrayList<Integer> numerosUtilizador;
    ArrayList<Integer> estrelasUtilizador;
    Random numeroAleatorio = new Random();
    Scanner numerosUtil = new Scanner(System.in);

    Euromilho() {
        numerosUtilizador = new ArrayList<>();
        System.out.println("Por favor, introduza 12 números (de 1 a 50):");
        for (int i = 0; i < 12; i++) {
            int numero = numerosUtil.nextInt();
            numerosUtilizador.add(numero);
        }

        estrelasUtilizador = new ArrayList<>();
        System.out.println("Por favor, introduza 2 estrelas (de 1 a 12):");
        for (int i = 0; i < 2; i++) {
            int estrela = numerosUtil.nextInt();
            estrelasUtilizador.add(estrela);
        }

        // Números sorteados
        numerosSorteados = new ArrayList<>();
        for (int j = 1; j <= 50; j++) {
            numerosSorteados.add(j);
        }
        for (int i = 0; i < 5; i++) {
            int valorAleatorio = numeroAleatorio.nextInt(numerosSorteados.size());
            System.out.println("Número sorteado: " + numerosSorteados.get(valorAleatorio));
            numerosSorteados.remove(valorAleatorio);
        }

        // Estrelas sorteadas
        estrelasSorteadas = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            estrelasSorteadas.add(i);
        }
        for (int i = 0; i < 2; i++) {
            int valorAleatorio = numeroAleatorio.nextInt(estrelasSorteadas.size());
            System.out.println("Estrela sorteada: " + estrelasSorteadas.get(valorAleatorio));
            estrelasSorteadas.remove(valorAleatorio);
        }

        // Verificar acertos
        verificarAcertos();
    }

    void verificarAcertos() {
        ArrayList<Integer> numerosAcertados = new ArrayList<>();
        ArrayList<Integer> estrelasAcertadas = new ArrayList<>();

        // Comparar números
        for (int i = 0; i < numerosUtilizador.size(); i++) {
            for (int j = 0; j < numerosSorteados.size(); j++) {
                if (numerosUtilizador.get(i).equals(numerosSorteados.get(j))) {
                    numerosAcertados.add(numerosUtilizador.get(i));
                    break; // Para evitar duplicados na lista de acertos
                }
            }
        }

        // Comparar estrelas
        for (int i = 0; i < estrelasUtilizador.size(); i++) {
            for (int j = 0; j < estrelasSorteadas.size(); j++) {
                if (estrelasUtilizador.get(i).equals(estrelasSorteadas.get(j))) {
                    estrelasAcertadas.add(estrelasUtilizador.get(i));
                    break; // Para evitar duplicados na lista de acertos
                }
            }
        }

        // Imprimir resultados
        System.out.println("Números acertados: " + numerosAcertados);
        System.out.println("Estrelas acertadas: " + estrelasAcertadas);
    }
}

// Para executar
public class Main {
    public static void main(String[] args) {
        new Euromilho();
    }
}
