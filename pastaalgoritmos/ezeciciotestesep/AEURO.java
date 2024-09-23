
import java.util.ArrayList;

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

    // Método para adicionar livros fornecidos pelo professor
    void adicionarLivros() {
        listaProdutos.add(new Produto("Livro A", 25.50f));
        listaProdutos.add(new Produto("Livro B", 35.75f));
        listaProdutos.add(new Produto("Livro C", 40.30f));
        listaProdutos.add(new Produto("Livro D", 22.10f));
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
        // Adiciona os livros fornecidos pelo professor
        adicionarLivros();

        System.out.println("Lista de livros fornecida pelo professor:");
        listarProdutos();

        System.out.println("\nTotal dos preços dos livros:");
        totalPrecos();
    }

    // Bloco de execução automática
    {
        executar(); // Executa a aplicação automaticamente ao iniciar a classe
    }
}
