package Calcular;

import java.util.ArrayList;

public class Fornecedor {
	
	public static ArrayList<Fornecedor> listaFornecedor = new ArrayList<>();
	
	
	
	static public void adicionarFornecedor(Fornecedor l) {
		listaFornecedor.add(l);
	}
	
	static public String listarFornecedor() {
		String saidaFornecedor = "";
		int i=1;
		for (Fornecedor l : listaFornecedor) {
			saidaFornecedor +="\n====== LISTA DE FORNECEDORES"+ (i++)+"======\n";
			saidaFornecedor += l.imprimirFornecedor()+"\n";
		}
		
		return saidaFornecedor;
	}
	
	private String  nome, endereço, cidade, estado, cep, telefone, pedFor, cnpj;

	public Fornecedor( String nome, String endereço, String cidade, String estado, String cep,

			String telefone, String pedFor, String cnpj) {
		
		this.nome = nome;
		this.endereço = endereço;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.telefone = telefone;
		this.pedFor = pedFor;
		this.cnpj = cnpj;
	}
	
	public Fornecedor() {}

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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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

	public String getPedFor() {
		return pedFor;
	}

	public void setPedFor(String pedFor) {
		this.pedFor = pedFor;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	} 
	
	public String imprimirFornecedor() {
		return "NOME: "+nome+"\nENDEREÇO: "+endereço+"\nCIDADE: "+cidade+"\nESTADO: "+estado+"\nCEP: "+cep+

				"\nTELEFONE: "+telefone+"\nPEDIDO FORNECEDOR: "+pedFor+"\nCNPJ: "+cnpj;
	}

}
