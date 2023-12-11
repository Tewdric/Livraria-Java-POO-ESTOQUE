package Calcular;

import java.util.ArrayList;

public class Livro {
	
	public static ArrayList<Livro> listaLivro = new ArrayList<>();
	public static ArrayList<Livro> listaLivroCliente = new ArrayList<>();
	
	public String codigo;
	public String titulo;
	public String autor;
	public String isbn;
	private float preço; 
	public Integer quantidade;


	
	


	public Livro( String titulo,  float preço, Integer quantidade) {
		
		this.titulo = titulo;
		this.preço = preço;
		this.quantidade = quantidade;
		
	}
	public  void Livro1(String titulo2, float preço2,Integer quantidade2) { 
		
		this.titulo = titulo2;
		this.preço = preço2;
		this.quantidade = quantidade2;
	}


	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public float getPreço() {
		return preço;
	}

	public void setPreço(float preço) {
		this.preço = preço;
	}

	
	public String imprimir() {
		return "Codigo: "+codigo+"\nTitulo: "+titulo+"\nAutor:"+autor+"\nIsbn:"+isbn+"\nPreço: RS "+preço;
	}
	
	

	static public void adicionarCliente(Livro l) {
		listaLivroCliente.add(l);
	}
	
	static public String listarCliente() {
		String saida = "";
		int i=1;
		
		for (Livro l : listaLivroCliente) {
			System.out.print("\n======LIVROS EM ESTOQUE=====\n");
			saida +="\n====== LIVRO Nº "+ (i++)+"======\n";
			saida += l.imprimir()+"\n";
		}
		
		return saida;
	}
	

	static Double calcularTotalValorCliente() {
		Double total = 0.00;
		
		for (Livro l : listaLivroCliente) {
			total += l.getPreço()*l.getQuantidade();
		}
		
		
		return total;
		
	}
	
	
	
	static public void adicionar(Livro l) {
		listaLivro.add(l);
	}
	
	static public String listar() {
		String saida = "";
		int i=1;
		
		for (Livro l : listaLivro) {
			System.out.print("\n======LIVROS EM ESTOQUE=====\n");
			saida +="\n====== LIVRO Nº "+ (i++)+"======\n";
			saida += l.imprimir()+"\n";
		}
		
		return saida;
	}
	
	
	static public boolean remover(String titulo) {
		for (Livro l : listaLivro) {
			if (l.getTitulo().equalsIgnoreCase(titulo)) {
				listaLivro.remove(l);
				return true;
			}
		}
		return false;
	}

	
	
	static Double calcularTotalValor() {
		Double total = 0.00;
		
		for (Livro l : listaLivro) {
			total += l.getPreço()*l.getQuantidade();
		}
		
		
		return total;
		
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
