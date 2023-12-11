package Calcular;

import java.util.ArrayList;

public class PedidoCliente {
	
	public static ArrayList<PedidoCliente> listaCodCliente = new ArrayList<>();
	public static ArrayList<PedidoCliente> listaDataRecebimentoCliente = new ArrayList<>();
	
	
	private int codCliente;
	private static String dataDeRecebimentoCliente;


	public int getCodCliente() {
		return codCliente;
	}


	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}


	public String getDataDeRecebimentoCliente() {
		return dataDeRecebimentoCliente;
	}


	public void setDataDeRecebimentoCliente(String dataDeRecebimentoCliente) {
		this.dataDeRecebimentoCliente = dataDeRecebimentoCliente;
	}


	static public String imprimirRemessaPedidoCliente() {
		return "Data de recebimento: " +dataDeRecebimentoCliente;
		
	}
	static public String listarRemessaPedidoCliente() {
		String saidaPedidoCLiente = "";
		int i=1;
		for (PedidoCliente l : listaDataRecebimentoCliente) {
			saidaPedidoCLiente +="\n====== LIVRO Nº "+ (i++)+"======\n";
			saidaPedidoCLiente += PedidoCliente.imprimirRemessaPedidoCliente()+"\n";
		}
		
		return saidaPedidoCLiente;
	}
	
	static public void adicionarListaRemessaPedidoCliente(PedidoCliente l) {
		listaDataRecebimentoCliente.add(l);
	}

}
