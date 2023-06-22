package Aula05;

import java.util.Date;

public class Usuario {

	public static void main(String[] args) {
		
		Usuario usuarios[] = new Usuario[2];
		usuarios[0] = new Usuario ("Arthur", "123456");
		usuarios[1] = new Usuario ("Luiza", "123456");
		
		for(Usuario usuario : usuarios) {
			System.out.println("Nome: " + usuario.getNome());
			System.out.println("Data de cadastro: " + usuario.getDataCadastro());
			System.out.println("--------");
		}
	
		
		
	}
		//atributos
		
		private String nome;
		private String email;
		private String telefone;
		private String senha;
		private Date dataCadastro;
	
		//construtor
		public Usuario (String nome, String senha) {
			this.nome = nome;
			this.senha = senha;
			this.dataCadastro = new Date();
	}
		
		private int id;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		public Date getDataCadastro() {
			return dataCadastro;
		}
		public void setDataCadastro(Date dataCadastro) {
			this.dataCadastro = dataCadastro;
		}

	}
	





