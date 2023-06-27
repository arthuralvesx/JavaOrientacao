package aulaCollections;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListVersusLinkedListPerformance {

	public static void main(String[] args) {
		
		Collection<Integer> lista = new ArrayList<Integer>();
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i <= 5000000; i++) {
			lista.add(i);
		}
		long fim = System.currentTimeMillis();
		
		long tempoGasto = fim - inicio;
		
		System.out.println(tempoGasto);
				
	}

}
