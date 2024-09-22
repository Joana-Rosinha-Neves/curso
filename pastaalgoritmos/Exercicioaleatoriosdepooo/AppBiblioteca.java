
import java.util.ArrayList;



class AppBiblioteca
{
    Livro instanciaLivro;
    ArrayList<Livro> listaLivro;
    
    

    AppBiblioteca()
    {
        listaLivro = new ArrayList();

        System.out.println("Bem-vindo/a Biblioteca");
        
    }
   void  adicionarlivro(String paramNome,float paramPreco)
   {
       instanciaLivro = new Livro(paramNome, paramPreco);
       listaLivro.add(instanciaLivro);
       
        //instanciaLivro = new Livro("amarelo", 3);
         //listaLivro.add(instanciaLivro);
   }
   void listarlivros()
   {
       if (listaLivro.size()==0)
       {
           System.out.println(" Não há livros");
       }
       else 
       {
           for (int i =0; i< listaLivro.size(); i++)
           { 
           System.out.println( listaLivro.get(i).titulo + listaLivro.get(i).preco);
           
           }
        }
    }
   void calcularPrecoTotal()
   {
       if ( listaLivro.size()==0)
       {
           System.out.println("nao há livros cadastrados");
       }
      float soma = 0f;
       for ( int i = 0; i<listaLivro.size(); i++)
       {
           soma = soma + listaLivro.get(i).preco;
           
       }
       System.out.println(soma);

       
       
   }
   void trocarLivroPeloTitulo()
   {
        for (int i =0; i< listaLivro.size(); i++)
           { 
           if (listaLivro.get(i).titulo.equals("amarelo"))
           { listaLivro.get(i).titulo= "verde";
               
            // posiçao
            System.out.println(i);
            listaLivro.get(1).preco = 3;
            
           }
     
   }
  

   
     // Imprime todos os livros após as trocas
        for (int i = 0; i < listaLivro.size(); i++) {
            System.out.println("Título: " + listaLivro.get(i).titulo + ", Preço: " + listaLivro.get(i).preco);
        }
    }adicionarlivro("fa",6);
    import java.util.ArrayList;

class Livro {
    String titulo;
    float preco;

    Livro(String titulo, float preco) {
        this.titulo = titulo;
        this.preco = preco;
    }
}

class AppBiblioteca {
    ArrayList<Livro> listaLivro;

    AppBiblioteca() {
        listaLivro = new ArrayList<>();
        System.out.println("Bem-vindo/a à Biblioteca");
    }

    void adicionarlivro(String paramNome, float paramPreco) {
        Livro livro = new Livro(paramNome, paramPreco);
        listaLivro.add(livro);
    }

    void listarlivros() {
        if (listaLivro.size() == 0) {
            System.out.println("Não há livros.");
        } else {
            for (int i = 0; i < listaLivro.size(); i++) {
                System.out.println("Título: " + listaLivro.get(i).titulo + ", Preço: " + listaLivro.get(i).preco);
            }
        }
    }

    void calcularPrecoTotal() {
        if (listaLivro.size() == 0) {
            System.out.println("Não há livros cadastrados.");
        } else {
            float soma = 0f;
            for (int i = 0; i < listaLivro.size(); i++) {
                soma += listaLivro.get(i).preco;
            }
            System.out.println("Preço total: " + soma);
        }
    }

    void trocarLivroPeloTitulo() {
        for (int i = 0; i < listaLivro.size(); i++) {
            if (listaLivro.get(i).titulo.equals("amarelo")) {
                listaLivro.get(i).titulo = "verde";
                System.out.println("Livro na posição " + i + " foi trocado para verde. Novo preço: " + listaLivro.get(i).preco);
            }
        }
        // Imprime todos os livros após as trocas
        for (int i = 0; i < listaLivro.size(); i++) {
            System.out.println("Título: " + listaLivro.get(i).titulo + ", Preço: " + listaLivro.get(i).preco);
        }
    }
    
    void removerPrimeiroLivro() {
        if (!listaLivro.isEmpty()) {
            listaLivro.remove(0); // Remove o primeiro livro
        }
    }
}

// Para testar as funções, você pode chamar as funções no main (se tiver)
// AppBiblioteca app = new AppBiblioteca();
// app.adicionarlivro("amarelo", 10);
// app.adicionarlivro("livro2", 15);
// app.trocarLivroPeloTitulo();
// app.listarlivros();
import java.util.ArrayList;

class Livro {
    String titulo;

    Livro(String titulo) {
        this.titulo = titulo;
    }
}

public class CompararLivros {
    public static void main(String[] args) {
        ArrayList<Livro> lista1 = new ArrayList<>();
        lista1.add(new Livro("livro1"));
        lista1.add(new Livro("livro2"));
        lista1.add(new Livro("livro3"));

        ArrayList<Livro> lista2 = new ArrayList<>();
        lista2.add(new Livro("livro2"));
        lista2.add(new Livro("livro1"));
        lista2.add(new Livro("livro4"));

        ArrayList<String> titulosIguais = encontrarTitulosIguais(lista1, lista2);
        
        if (titulosIguais.size() == 2) {
            System.out.println("Existem exatamente dois livros iguais: " + titulosIguais);
        } else {
            System.out.println("Existem " + titulosIguais.size() + " livros iguais: " + titulosIguais);
        }
    }

    public static ArrayList<String> encontrarTitulosIguais(ArrayList<Livro> lista1, ArrayList<Livro> lista2) {
        ArrayList<String> titulosEncontrados = new ArrayList<>();

        for (int i = 0; i < lista1.size(); i++) {
            for (int j = 0; j < lista2.size(); j++) {
                if (lista1.get(i).titulo.equals(lista2.get(j).titulo)) {
                    titulosEncontrados.add(lista1.get(i).titulo);
                    break; // Para evitar contar o mesmo livro mais de uma vez
                }
            }
        }

        return titulosEncontrados; // Retorna a lista de títulos iguais
    }
}

}

