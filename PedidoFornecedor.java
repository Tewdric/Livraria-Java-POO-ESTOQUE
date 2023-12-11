package Calcular;

import java.util.ArrayList;

public class PedidoFornecedor {
	
	public static  ArrayList<PedidoFornecedor> listaCodFornecedor = new ArrayList<>();
	
	
	private String codFornecedor, dataDeRecebimento;

	public PedidoFornecedor(String dataDeRecebimento, String codFornecedor) {
		this.codFornecedor = codFornecedor;
		this.dataDeRecebimento = dataDeRecebimento;
	}

	public String getCodFornecedor() {
		return codFornecedor;
	}

	public void setCodFornecedor(String codFornecedor) {
		this.codFornecedor = codFornecedor;
	}

	public String getDataDeRecebimento() {
		return dataDeRecebimento;
	}

	public void setDataDeRecebimento(String dataDeRecebimento) {
		this.dataDeRecebimento = dataDeRecebimento;
	}
	
	static public String listarPedidoFornecedor() {
		String saidaPedidoFornecedor = "";
		int i=1;
		for (PedidoFornecedor l : listaCodFornecedor) {
			saidaPedidoFornecedor +="\n====== LISTA DE PEDIDOS "+ (i++)+"======\n";
			saidaPedidoFornecedor += l.imprimirPedidoFornecedor()+"\n";
		}
		
		return saidaPedidoFornecedor;
	}
	public String imprimirPedidoFornecedor() {
		return "Codigo pedido Fornecedor:"+codFornecedor+"\nData de recebimento: "+dataDeRecebimento;
	}
	
	static public void adicionarPedidoFornecedor(PedidoFornecedor l) {
		listaCodFornecedor.add(l);
	}
	
	static public boolean removerPedidoFornecedor(String codFornecedor) {
		for (PedidoFornecedor l : listaCodFornecedor) {
			if (l.getCodFornecedor().equalsIgnoreCase(codFornecedor)) {
				listaCodFornecedor.remove(l);
				return true;
			}
		}
		return false;
	}
	
}
