package views;
import models.Produto;
import java.util.ArrayList;

public class ListarProdutos {
    public void rodar() {

        ArrayList<Produto> produtos = new ArrayList<Produto>();

        System.out.println("\n -- LISTAGEM DE PRODUTOS -- \n");
        for(Produto produtoCadastrado : produtos){
        System.out.println(produtoCadastrado);
        }

    }
    
}
