import java.util.ArrayList;


class Gestao
{
Produto instaciaProduto;
 ArrayList<Produto> listaProduto;


    Gestao()
    {
        listaProduto = new ArrayList();
        System.out.println(" Bem-vindo a aplcaçao de gestao!");
    }
    
    void inserirProduto(String paramNome, float paramPreco)
    {
       instaciaProduto = new Produto(paramNome, paramPreco);
       listaProduto.add(instaciaProduto);
    }
    void listarProdutos ()
    {
        for (int i = 0; i< listaProduto.size();i++)
        {
            System.out.println( listaPordutoget(i).name + ": " + listaProduto.get(i).preco);
            
        }
    }
    void totalPreco()
    {
        
    }
}