package Aula03;



public class TestaConta {

	public static void main(String[] args) {
		
		// objetos
		Cliente arthur = new Cliente("Arthur"+ "", "123456789", "Rua X, 123", null);
		Cliente luiza = new Cliente("Luiza", "987654321", "Rua z, 231", null);
		Conta contaArthur = new Conta(arthur , 1, 1,"teste");
		Conta contaLuiza = new Conta(luiza , 2, 1, "teste");
		
		// simulações
		contaArthur.depositar(1000);
		contaLuiza.depositar(2000);
		
		contaArthur.exibirSaldo();
		contaLuiza.exibirSaldo();
		
		contaArthur.sacar(5000);
		contaLuiza.sacar(5000);
		
		contaArthur.transferir(contaLuiza, 1000);
		
		contaArthur.exibirSaldo();
		contaLuiza.exibirSaldo();
		contaArthur.exibirSaldo();
	

	}

}
