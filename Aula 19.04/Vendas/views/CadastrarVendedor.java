package views;
import java.util.ArrayList;
import utils.Console;
import models.Vendedor;

public class CadastrarVendedor {
    public void rodar() {
        Vendedor vendedor;
        ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();

        vendedor = new Vendedor();
        System.out.println("\n -- CADASTRO DE VENDEDOR -- \n");
        vendedor.setNome(Console.readString("Digite o nome do vendedor: "));
        vendedor.setCpf(Console.readString("Digite o CPF do vendedor: "));
        vendedores.add(vendedor);
        
    }
    
}
