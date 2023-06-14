package Aula03;

import java.util.Date;

public class TestaConta {

	public static void main(String[] args) {
		
		
		CDB cdb = new CDB();
		LCA lca = new LCA();
		LCI lci = new LCI();
		
		
		// objetos
		Cliente arthur = new Cliente("Arthur"+ "", "123456789", "Rua X, 123", null);
		Cliente luiza = new Cliente("Luiza", "987654321", "Rua z, 231", null);
		ContaCorrente contaArthur = new ContaCorrente(arthur , 1, 1,"teste");
		ContaCorrente contaLuiza = new ContaCorrente(luiza , 2, 1, "teste");
		
		// simulações
		contaArthur.depositar(1000);
		contaLuiza.depositar(2000);
		
		contaArthur.exibirSaldo();
		contaLuiza.exibirSaldo();
		
		contaArthur.sacar(100);
		contaLuiza.sacar(500);
		
		contaArthur.transferir(contaLuiza, 100);
		
		contaArthur.investimento(lci, 1000);
		contaArthur.exibirSaldo();
		
	
		Conta.exibirContador();

	}

}
