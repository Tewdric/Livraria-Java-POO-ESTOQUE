package Calcular;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader reader = new BufferedReader(
	            new InputStreamReader(System.in));
		String opcaoPrincipal ="5";
		do {
		System.out.println("Entre com uma opção:");
		System.out.println("1-Cadastrar pedido de cliente");
		System.out.println("2-Cadastrar pedido de fornecedor");
		System.out.println("3-Calcular total de vendas");
		System.out.println("4-Calcular total de compras");
		System.out.println("5-sair");
		
		opcaoPrincipal = reader.readLine();
		switch(opcaoPrincipal) {
		case "1"://Cadastrar pedido do cliente
			
			Cliente cliente new Cliente();
			System.out.println("Entre com o nome");
			cliente.setNome(reader.readLine());
			
			Boolean opcaoPedidoCli = false;
			do {
				PedidoCliente pedcli= new PedidoCliente();
				System.out.println("Entre com a data da remessa");
				pedcli.setDataRemessaCliente(reader.readLine());
				
				//demais metodos se for o caso
				Boolean opcaolivroPedidoCli = false
				
				do {
					Livro livcli = new Livro();
					System.out.println("Entre com o titulo");
					livcli.setTitulo(reader.readLine());
					
					//mais metodos
					System.out.println("Deseja inserir um novo Livro");
					System.out.println("1 - Sim");
					System.out.println("2-Não");
					String opcaoPedidoCliStr = reader.readLine();
					opcaoPedidoCli = opcaolivroPedidoCli.equals("1");	
					
				}while(opcaolivroPedidoCli);
				
				System.out.println("Deseja inserir um novo pedido");
				System.out.println("1 - Sim");
				System.out.println("2-Não");
				String opcaoPedidoCliStr = reader.readLine();
				opcaoPedidoCli = opcaoPedidoCliStr.equals("1");				
				
				
			}while(opcaoPedidoCli);
			
			
			
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
			break;
		
		}
		
		}while(!opcaoPrincipal.equals( "5"));

	}
	}

