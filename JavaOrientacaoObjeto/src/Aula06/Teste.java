package Aula06;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Teste {
	// Collection
	static List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	static int c = 6; // contador

	public static void main(String[] args) {

		// Objetos usuario
		Usuario emerson = new Usuario(1, "Emerson", "abc");
		Usuario adriane = new Usuario(2, "Adriane", "abc");
		Usuario maria = new Usuario(3, "Maria", "abc");
		Usuario joao = new Usuario(4, "Joao", "abc");
		Usuario pedro = new Usuario(5, "Pedro", "abc");

		// Adicionando objetos Usuario a lista de usuarios
		listaUsuarios.add(emerson);
		listaUsuarios.add(adriane);
		listaUsuarios.add(maria);
		listaUsuarios.add(joao);
		listaUsuarios.add(pedro);

		// Ver lista de usuarios
		for (Usuario usuario : listaUsuarios) {
			System.out.println("ID usuario: " + usuario.getIdUsuario());
			System.out.println("Nome do usuario: " + usuario.getNome());
			System.out.println("Senha do usuario: " + usuario.getSenha());
		}
		
		//Collections.sort(listaUsuarios)
		menu();
		novoUsuario();
		verListaUsuario();

	}

	public static void menu() {
		int op = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Sistema de usurios \n1)Criar\n2)Remover3)Ver lista de Usuarios"));
		switch (op) {
		case 1:
			novoUsuario();
			break;
		case 2:
			op = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o nome do usuario que deseja remover"));
			//removerUsuario(op);
		}
	}

	// Função que cria novos usuarios
	public static void novoUsuario() {
		// Adicionar usuario
		while (true) {
			String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
			String senha = JOptionPane.showInputDialog(null, "Digite a senha para a conta");

			Usuario newUsuario = new Usuario(c++, nome, senha);
			listaUsuarios.add(newUsuario);

			String op = JOptionPane.showInputDialog(null, "Deseja criar um novo Usuario? s/n");
			if (op.toLowerCase().equals("n")) {
				break;
			}

		}
	}

	// Função que mostra a lista de usuarios
	public static void verListaUsuario() {
		for (Usuario usuario : listaUsuarios) {
			System.out.println("ID usuario: " + usuario.getIdUsuario());
			System.out.println("Nome do usuario: " + usuario.getNome());
			System.out.println("Senha do usuario: " + usuario.getSenha());
		}
	}

	public static void removerUsuario(String nome) {
		listaUsuarios.remove(nome);
	}

}
