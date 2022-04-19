package views;

import controllers.ClienteController;
import utils.Console;
import models.Cliente;
public class CadastrarCliente {

    public void rodar() {
        Cliente cliente = new Cliente();
        ClienteController clienteController = new ClienteController();

        System.out.println("\n -- CADASTRO DE CLIENTES -- \n");
        cliente.setNome(Console.readString("Digite o nome do cliente: "));
        cliente.setCpf(Console.readString("Digite o CPF do cliente: "));

        clienteController.cadastrar(cliente);
        
        System.out.println("\nCliente cadastrado !!!");

    }


    
}
