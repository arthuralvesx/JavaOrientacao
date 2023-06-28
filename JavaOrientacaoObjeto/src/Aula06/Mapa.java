package Aula06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Mapa {
	
	public static void main(String[] args) {
		
		//lista de usuarios
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();	
		
		//Mapa
		Map mapa = new HashMap();
		mapa.put("Otavio", listaUsuarios);
		
		
		//Exercicio 3
		
		//Collection <Integer> lista = new ArrayList<Integer>();
		Collection <Long> lista = new LinkedList<Long>();
		
		Long inicio = System.currentTimeMillis();
		
		for(long i = 0; i <= 100000000; i++) {
			lista.add(i);
		}
		
		long fim = System.currentTimeMillis();
		long tempoGasto = fim - inicio;
		
		System.out.print("Tempo gasto: " + tempoGasto);
	}

}
