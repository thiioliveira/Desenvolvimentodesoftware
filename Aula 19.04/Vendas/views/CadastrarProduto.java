package views;
import utils.Console;
import models.Produto;
import java.util.ArrayList;

public class CadastrarProduto {

    public void rodar() {
        Produto produto;
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        produto = new Produto();
        System.out.println("\n -- CADASTRO DE PRODUTO -- \n");
        produto.setNome(Console.readString("Digite o nome do produto: "));
        produto.setPreco(Console.readFloat("Digite o Preço do produto: "));
        produto.setQuantidade(Console.readInt("Digite a Quantidade do produto: "));
        produtos.add(produto);

    }
    
}
