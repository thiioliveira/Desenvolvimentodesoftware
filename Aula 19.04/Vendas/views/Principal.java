package views;

import utils.Console;
public class Principal {
    public static void main(String[] args) {
        int opcao = 0;

        do {
            System.out.println("\n -- PROJETO DE VENDAS -- \n");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Cadastrar Vendedor");
            System.out.println("4 - Listar Vendedores");
            System.out.println("5 - Cadastrar Produto");
            System.out.println("6 - Listar Produtos");
            System.out.println("0 - Sair\n");
            opcao = Console.readInt("Digite uma opção: ");

            switch (opcao) {
                case 1:
                    CadastrarCliente cadastrarCliente = new CadastrarCliente();
                    cadastrarCliente.rodar();

                                        
                    break;
                case 2:
                    ListarClientes listarClientes = new ListarClientes();
                    listarClientes.rodar();
                    
                    break;
                case 3:
                    CadastrarVendedor cadastrarVendedor = new CadastrarVendedor();
                    cadastrarVendedor.rodar();
                    
                    break;
                case 4:
                    ListarVendedores listarVendedores = new ListarVendedores();
                    listarVendedores.rodar();
                    
                    break;
                case 5:
                    CadastrarProduto cadastrarProduto = new CadastrarProduto();
                    cadastrarProduto.rodar();
                   
                    break;
                case 6:
                    ListarProdutos listarProdutos = new ListarProdutos();
                    listarProdutos.rodar();
                    
                    break;

                case 0:
                    System.out.println("\n -- SAINDO -- \n");
                    break;
                default:
                    System.out.println("\n --OPÇÃO INVALIDA -- \n");
                    break;
            }

        } while (opcao != 0);
    }
}