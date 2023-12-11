package Calcular;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList<Fornecedor> listaFornecedor = new ArrayList<>();
		ArrayList<Cliente> listaCliente = new ArrayList<>();
		
		Scanner entrada = new Scanner(System.in);
		
		BufferedReader reader = new BufferedReader(
	            new InputStreamReader(System.in));
		
		
		
		String opcaoPrincipal = "5";
		
		do {
			
			
			
			exibirMenuLogin();
			opcaoPrincipal = reader.readLine();
			switch(opcaoPrincipal) {
			case "1"://Cadastrar pedido do cliente
				System.out.println("\n===CADASTRO CLIENTE===\n");
				Cliente cliente = new Cliente();
				System.out.println("Digite o nome: ");
				cliente.setNome(reader.readLine());
				System.out.println("Digite o nome endereço: ");
				cliente.setEndereço(reader.readLine());
				System.out.println("Digite a cidade: ");
				cliente.setCidade(reader.readLine());
				System.out.println("Digite o CEP: ");
				cliente.setCep(reader.readLine());
				System.out.println("Digite o telefone: ");
				cliente.setTelefone(reader.readLine());
				
				System.out.println("\n===CADASTRO EFETUDO===\n");
				System.out.println("Nome: "+cliente.getNome()+"\nEndereço: "+cliente.getEndereço()+"\nCidade: "+cliente.getCidade()+"\nCep: "+cliente.getCep()+"\nTelefone: "+cliente.getTelefone());
				
				Boolean opcaoPedidoCliente = false;
				do {
					
					PedidoCliente pedidoCliente = new PedidoCliente();
					System.out.println("\nDigite a data que deseja retirar ou receber o livro: \n");
					pedidoCliente.setDataDeRecebimentoCliente(reader.readLine());
					
					
					Boolean opcaoPedidoLivroCliente = false;
					
					do {
						
						System.out.println("\nDeseja inserir um novo Livro\n");
						System.out.println("1 - Sim");
						System.out.println("2 - Não");
						String opcaoPedidoClienteStr = reader.readLine();
						
						if(opcaoPedidoClienteStr.equals("1")){
							
							
							String titulo;
							Integer quantidade;
							float preço;
							
							System.out.println("\nDigite o titulo: ");
							titulo =reader.readLine();
							System.out.println("\nDigite o a quantidade de Livros: ");
							quantidade =entrada.nextInt();
							
							
							Random rand = new Random();
							float upperbound = 100;
							
							preço = rand.nextFloat();
							Livro objLivro;
							objLivro = new Livro(titulo, preço, quantidade);
							
							Livro.adicionarCliente(objLivro);
							
							
						}					
						opcaoPedidoCliente = opcaoPedidoLivroCliente.equals("1");

					}while(opcaoPedidoLivroCliente);
					
					
			
				System.out.println("\nDeseja inserir um novo pedido: \n");
				System.out.println("1 - Sim");
				System.out.println("2 - Não");
				String opcaoPedidoCliStr = reader.readLine();
				opcaoPedidoCliente = opcaoPedidoCliStr.equals("1");
				
				}while(opcaoPedidoCliente);
			
				
		}
			switch(opcaoPrincipal) {
			case "2":
				System.out.println("\n===CADASTRO FORNECEDOR===\n");
				Fornecedor fornecedor = new Fornecedor();
				System.out.println("Digite o nome: ");
				fornecedor.setNome(reader.readLine());
				System.out.println("Digite o nome endereço: ");
				fornecedor.setEndereço(reader.readLine());
				System.out.println("Digite a cidade: ");
				fornecedor.setCidade(reader.readLine());
				System.out.println("Digite o CEP: ");
				fornecedor.setCep(reader.readLine());
				System.out.println("Digite o telefone: ");
				fornecedor.setTelefone(reader.readLine());
				System.out.println("Digite o pedido: ");
				fornecedor.setPedFor(reader.readLine());
				System.out.println("Digite o CNPJ: ");
				fornecedor.setCnpj(reader.readLine());
				System.out.println("Digite o estado: ");
				fornecedor.setEstado(reader.readLine());
				
				System.out.println("\n===CADASTRO EFETUDO===\n");
				
				System.out.println("Nome: "+fornecedor.getNome()+"\nEndereço: "+fornecedor.getEndereço()+"\nCidade: "+fornecedor.getCidade()+"\nCep: "
				+fornecedor.getCep()+"\nTelefone: "+fornecedor.getTelefone()+"\nPedido: "+fornecedor.getPedFor()+"\nCNPJ: "+fornecedor.getCnpj()+"\nEstado: "+fornecedor.getEstado());
				
				Boolean opcaoPedidoFornecedor = false;
				
				do {
					PedidoCliente pedidoFornecedor = new PedidoCliente();
					System.out.println("Digite a data de entrega dos livros:  ");
					pedidoFornecedor.setDataDeRecebimentoCliente(reader.readLine());
					PedidoFornecedor [] recebimentoFornecedor = new PedidoFornecedor [0];
					
					Boolean opcaoPedidoLivroFornecedor = false;
					do {
						
						System.out.println("\nDeseja inserir um novo Livro");
						System.out.println("1 - Sim");
						System.out.println("2 - Não");
						String opcaoPedidoFornecedorStr = reader.readLine();
						
						if(opcaoPedidoFornecedorStr.equals("1")){
							
							
							String titulo;
							float preço;
							Integer quantidade;
							
							
	
							
							System.out.println("Digite o titulo: ");
							titulo = reader.readLine();
							System.out.println("Digite o a quantidade de Livros: ");
							quantidade =entrada.nextInt();
							System.out.println("Digite o preço unitário: ");
							preço = entrada.nextFloat();
							
							Livro objLivro = new Livro(titulo, preço, quantidade);
							
							Livro.adicionar(objLivro);
	
							
						}					
						opcaoPedidoFornecedor = opcaoPedidoLivroFornecedor.equals("1");
					}while(opcaoPedidoLivroFornecedor);
					
				}while(opcaoPedidoFornecedor);
				
			}
			switch(opcaoPrincipal) {
			case "3":
				System.out.println("=======VALOR DE VENDA TOTAL=======");
				System.out.println("O total é: "+String.format("RS %.2f \n", Livro.calcularTotalValorCliente()));
				break;
			}
			switch(opcaoPrincipal) {
			case "4":
				System.out.println("=======VALOR DE COMPRA TOTAL=======");
				System.out.println("O total é: "+String.format("RS %.2f \n", Livro.calcularTotalValor()));
				break;
			}
		
		}while(!opcaoPrincipal.equals("5"));

		
	
	}
		
		
				
		

					

	static void exibirMenuLogin() {
		System.out.println("1 - CADASTRAR PEDIDO DO  CLIENTE");
		System.out.println("2 - CADASTRAR PEDIDO DO FORNECEDOR");
		System.out.println("3 - CALCULAR TOTAL DE VENDAS");
		System.out.println("4 - CALCULAR TOTAL DE COMPRAS");
		System.out.println("5 - SAIR ");

	}

	
}
