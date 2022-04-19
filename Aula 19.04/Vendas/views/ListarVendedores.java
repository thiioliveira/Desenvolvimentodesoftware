package views;
import models.Vendedor;
import java.util.ArrayList;

public class ListarVendedores {

    public void rodar() {
        ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();

        System.out.println("\n -- LISTAGEM DE VENDEDORES -- \n");
        for(Vendedor vendedorCadastrado : vendedores){
        System.out.println(vendedorCadastrado);
        }
    }
    
}
