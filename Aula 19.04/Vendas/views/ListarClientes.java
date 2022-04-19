package views;
import models.Cliente;

import java.util.ArrayList;

import controllers.ClienteController;

public class ListarClientes {
    public void rodar() {
        ClienteController clienteController = new ClienteController();

        ArrayList<Cliente> clientes = clienteController.listar();
        
        System.out.println("\n -- LISTAGEM DE CLIENTES -- \n");   
        for(Cliente clienteCadastrado : clientes){
        System.out.println(clienteCadastrado);
        }
    }
    
}
