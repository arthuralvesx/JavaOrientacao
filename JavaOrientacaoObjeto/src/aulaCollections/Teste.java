package aulaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teste {

	public static void main(String[] args, Object usuario) {
		
		Usuario arthur = new Usuario(1, "Arthur", "abc");
		Usuario felipe = new Usuario(2, "Felipe", "abc");
		Usuario emerson = new Usuario(3, "Emerson", "abc");
		Usuario kaike = new Usuario(4, "Kaike", "abc");
		Usuario luiza = new Usuario(5, "Luiza", "abc");
		
		//Collections
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		//adicionando objetos Usuario a lista de Usuario
		listaUsuarios.add(arthur);
		listaUsuarios.add(felipe);
		listaUsuarios.add(emerson);
		listaUsuarios.add(kaike);
		listaUsuarios.add(luiza);
		
	
		for(Usuario usuarios:listaUsuarios) {
			System.out.println("Id: " +usuarios.getIdUsuario() + "--" + "Nome: " +usuarios.getNome());
		}
		
		//ordenar a lista conforme regra defina no compareTo
		Collections.sort(listaUsuarios);
		
		System.out.println("--------");
		
		//iterando a lista ordenad
		for(Usuario usuarios : listaUsuarios) {
			System.out.println("Id: " +usuarios.getIdUsuario() + "--" +usuarios.getNome());
		}
		
		
	}
}
