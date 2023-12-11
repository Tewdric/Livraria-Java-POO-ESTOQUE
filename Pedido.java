package Calcular;

import java.util.ArrayList;

public abstract class Pedido {
	
	

	public static ArrayList<PedidoCliente> listaPedidoCliente = new  ArrayList<>();
	public static ArrayList<PedidoFornecedor> listaPedidoFornecedor = new  ArrayList<>();
	public static ArrayList<PedidoCliente> listaDataRecebimentoCliente = new ArrayList<>();
	
	public String cogigo, datapedido, listaLivroPedido;
	public double valor;

	public String getCogigo() {
		return cogigo;
	}

	public void setCogigo(String cogigo) {
		this.cogigo = cogigo;
	}

	public String getDatapedido() {
		return datapedido;
	}

	public void setDatapedido(String datapedido) {
		this.datapedido = datapedido;
	}

	public String getListaLivroPedido() {
		return listaLivroPedido;
	}

	public void setListaLivroPedido(String listaLivroPedido) {
		this.listaLivroPedido = listaLivroPedido;
	}


	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}


	
	
}

