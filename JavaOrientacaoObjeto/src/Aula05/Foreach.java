package Aula05;

public class Foreach {

	public static void main(String[] args) {
		
		int [] numeros = new int [10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] + "\t");		
	}
		
		for (int numero : numeros) {
			System.out.println(numero + "\t");
	
		}	
		
	}
	
}
