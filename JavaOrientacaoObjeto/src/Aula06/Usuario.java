package Aula06;

public class Usuario implements Comparable<Usuario>{
	
	private int idUsuario;
	private String nome, senha;
	
	public Usuario(int id, String nome, String senha) {
		super();
		this.idUsuario = id;
		this.nome = nome;
		this.senha = senha;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int compareTo(Usuario user) {
		if (this.getIdUsuario() < user.getIdUsuario()) {
			return -1;
		}
		if(this.getIdUsuario() > user.getIdUsuario()) {
			return 1;
		}
		return 0;
	}
	
}
