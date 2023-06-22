package Aula05;

import java.util.ArrayList;
import java.util.List;

public class ExemplosListaCollectios {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		lista.add("Arthur");
		lista.add("Felipe");
		lista.add("Luiza");
		
		List <Usuario> list = new ArrayList<Usuario>();
		Usuario arthur = new Usuario ("Arthur","123");
		Usuario luiza = new Usuario ("Luiza","123");
		Usuario felipe = new Usuario ("Felipe","123");
		lista.add("Arthur");
		lista.add("Luiza");
		lista.add("Felipe");
		
		for (String string : lista) {
			System.out.println(string);
		}
		System.out.println("");
		
		for (Usuario usuario: list) {
			System.out.println(usuario.getNome());
		}

	}

}
