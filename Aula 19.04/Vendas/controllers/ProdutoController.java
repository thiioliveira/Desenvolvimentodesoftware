package controllers;
import java.util.ArrayList;
import models.Produto;

public class ProdutoController {

    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public void cadastrar(Produto produto) {
        produtos.add(produto);

    }

    public ArrayList<Produto> listar() {
        return produtos;

    }
    
}
