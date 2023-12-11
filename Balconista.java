package Calcular;

public class Balconista {
	
	public String nomeUsuario;
	public String senha;
	public Integer nivelAcesso;
	
	public Balconista(String nomeUsuario, String senha, Integer nivelAcesso) {
		super();
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
		this.nivelAcesso = nivelAcesso;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Integer getNivelAcesso() {
		return nivelAcesso;
	}
	public void setNivelAcesso(Integer nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

	
}
