import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    String nome;
    float preco;

    Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

class AppGestao {
    ArrayList<Produto> listaProdutos = new ArrayList<>();
    float som = 0f;
    Scanner scanner = new Scanner(System.in);

    void inserirProduto() {
        System.out.print("Insira o nome do livro: ");
        String nome = scanner.nextLine();

        System.out.print("Insira o preço do livro: ");
        float preco = scanner.nextFloat();
        scanner.nextLine(); // Limpar o buffer do Scanner após o nextFloat()

        Produto novoProduto = new Produto(nome, preco);
        listaProdutos.add(novoProduto);
    }

    void listarProdutos() {
        if (listaProdutos.size() == 0) {
            System.out.println("Não existem produtos.");
            return; // Guard clause para sair da função
        }

        // Usando o 'for' tradicional para iterar pela lista de produtos
        for (int i = 0; i < listaProdutos.size(); i++) {
            Produto produto = listaProdutos.get(i);
            System.out.println("Livro: " + produto.nome + " | Preço: " + produto.preco);
        }
    }

    void totalPrecos() {
        if (listaProdutos.size() == 0) {
            System.out.println("Não existem produtos.");
            return; // Guard clause para sair da função
        }

        som = 0f; // Resetar a soma para recalcular

        // Usando o 'for' tradicional para somar os preços
        for (int i = 0; i < listaProdutos.size(); i++) {
            som += listaProdutos.get(i).preco;
        }
        System.out.println("A soma dos preços é: " + som);
        System.out.println("Total de produtos: " + listaProdutos.size());
    }

    // Método para executar a aplicação
    void executar() {
        while (true) {  // Laço infinito até que a opção de sair seja escolhida
            System.out.println("\nMenu:");
            System.out.println("1 - Inserir Livro");
            System.out.println("2 - Listar Livros");
            System.out.println("3 - Total dos Preços");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer após ler a opção

            // Guard clause para encerrar o loop quando a opção for 0
            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            // Guard clauses para tratar as opções de forma direta
            if (opcao == 1) {
                inserirProduto();
                continue; // Volta para o início do loop
            }

            if (opcao == 2) {
                listarProdutos();
                continue; // Volta para o início do loop
            }

            if (opcao == 3) {
                totalPrecos();
                continue; // Volta para o início do loop
            }

            // Caso o número não seja válido
            System.out.println("Opção inválida. Tente novamente.");
        }

        scanner.close();
    }

    // Bloco de execução automática
    {
        executar(); // Executa a aplicação automaticamente ao iniciar a classe
    }
}
