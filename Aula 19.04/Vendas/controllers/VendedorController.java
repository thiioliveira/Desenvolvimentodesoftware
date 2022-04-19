package controllers;
import java.util.ArrayList;
import models.Vendedor;

public class VendedorController {

    private ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();

    public void cadastrar(Vendedor vendedor) {
        vendedores.add(vendedor);

    }

    public ArrayList<Vendedor> listar() {
        return vendedores;

    }
    
}
