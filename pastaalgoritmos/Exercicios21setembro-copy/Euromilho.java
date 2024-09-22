
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Euromilho {
    ArrayList<Integer> numeros;
    ArrayList<Integer> estrelas;
    Random numeroAleatorio = new Random();
    Scanner numerosUtil = new Scanner(System.in);
    ArrayList<Integer> numerosUtilizador;
    ArrayList<Integer> estrelasUtilizador;

    Euromilho() {
        numerosUtilizador = new ArrayList<>();
        estrelasUtilizador = new ArrayList<>();

        // Coletando números do usuário
        System.out.println("Por favor, introduza 12 números (1 a 50):");
        for (int i = 0; i < 12; i++) {
            int numero = numerosUtil.nextInt();
            if (numero >= 1 && numero <= 50) {  // Validação de entrada
                numerosUtilizador.add(numero);
            } else {
                System.out.println("Número inválido! Por favor, insira um número entre 1 e 50.");
                i--; // Para garantir que temos 12 números válidos
            }
        }

        // Coletando estrelas do usuário
        System.out.println("Por favor, introduza 2 estrelas (1 a 12):");
        for (int i = 0; i < 2; i++) {
            int estrela = numerosUtil.nextInt();
            if (estrela >= 1 && estrela <= 12) {  // Validação de entrada
                estrelasUtilizador.add(estrela);
            } else {
                System.out.println("Estrela inválida! Por favor, insira uma estrela entre 1 e 12.");
                i--; // Para garantir que temos 2 estrelas válidas
            }
        }

        // Gerando números aleatórios
        numeros = new ArrayList<>();
        for (int j = 1; j < 51; j++) {
            numeros.add(j);
        }

        System.out.println("Números aleatórios sorteados:");
        for (int i = 0; i < 5; i++) {
            int valorAleatorio = numeroAleatorio.nextInt(numeros.size());
            System.out.println(numeros.get(valorAleatorio));
            numeros.remove(valorAleatorio);  // Remove o número sorteado
        }

        // Gerando estrelas aleatórias
        estrelas = new ArrayList<>();
        for (int i = 1; i < 13; i++) {
            estrelas.add(i);
        }

        System.out.println("Estrelas aleatórias sorteadas:");
        for (int i = 0; i < 2; i++) {
            int valorAleatorio = numeroAleatorio.nextInt(estrelas.size());
            System.out.println(estrelas.get(valorAleatorio));
            estrelas.remove(valorAleatorio);  // Remove a estrela sorteada
        }
    }

    public static void main(String[] args) {
        new Euromilho();  // Inicia o jogo
    }
}
