package Aula05;

public class Vetores {

	public static void main(String[] args) {
		
		int [] x = new int [10];
		lerVetor(x);
		imprimirVetor(x);
	}

	public static void lerVetor(int[] x) {
		for (int i = 0; i <x.length; i++) {
			x[i] = 2 * i;
		}
	}
	
	public static void imprimirVetor(int[] x) {
		for (int i = 0; i < x.length; i ++) {
			System.out.println(x[i] + "\t");	
		}
	}
}
