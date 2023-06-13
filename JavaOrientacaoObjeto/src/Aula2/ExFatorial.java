package Aula2;

import java.util.Scanner;

public class ExFatorial {

	public static void main(String[] args) {
		
		int fatorial = 1, valor = 1;
		
		for (int i = 1; i <= valor; i++) {
			fatorial *= i;
		}
		
		System.out.println(valor + "! = " +fatorial);	
	}
}		
		