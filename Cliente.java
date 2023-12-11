package Calcular;

import java.util.ArrayList;

public class Cliente {
	
	

	public static ArrayList<Cliente> listaCliente = new ArrayList<>();
	
	public static void setListaCliente(ArrayList<Cliente> listaCliente) {
		Cliente.listaCliente = listaCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	private String nome, endereço, cidade, cep, telefone;
	

	

}
