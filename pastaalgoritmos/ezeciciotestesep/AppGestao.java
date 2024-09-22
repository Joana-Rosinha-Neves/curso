import java.util.ArrayList;




class AppGestao
{
    Produto instanciaProduto;  
    ArrayList<Produto> listaProdutos;
    
    float som=0f;   
    AppGestao()
    {
        listaProdutos = new ArrayList();
        System.out.println(" Bem-vindo a Aplicacao de gestao");     
    
    }
    void inserirProduto(String paramNome, float paramPreco )
    {
        instanciaProduto = new Produto(paramNome, paramPreco);
        
        listaProdutos.add(instanciaProduto);
    }
    void listarProdutos()
    {
        if (listaProdutos.size()==0)
        {System.out.println(" Não existem Produtos");
        }
        
        for (int i =0; i<listaProdutos.size() ;i++)
        {
            System.out.println(listaProdutos.get(i).nome + listaProdutos.get(i).preco);
        }
        
    }
    void totalPrecos()
    {
       if (listaProdutos.size()==0)
        {System.out.println(" Não existem Produtos");
        }
        else
        {
            for (int i =0; i<listaProdutos.size() ;i++)
            {
             som = som + listaProdutos.get(i).preco;
          
            }   
         System.out.println( " a soma é" + som);
         
         System.out.println( listaProdutos.size());
        }
}
}
