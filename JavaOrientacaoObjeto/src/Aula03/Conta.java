package Aula03;

import java.util.Date;

public abstract class Conta {
	
	// atributos
	protected int numeroConta, agencia;
	protected String senha;
	protected Date dataAbertura;
	protected double saldo;
	protected Cliente cliente; //composição
	private static long contador;
	
	// construtor
	public Conta(Cliente cliente, int numeroConta, int agencia,
			String senha) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.dataAbertura = new Date(System.currentTimeMillis());
		this.senha = senha;
		System.out.println("Conta criado");
		System.out.println("Data abertura: " + this.dataAbertura);
		contador++;
	}
	
	public Conta(Cliente cliente2, long numeroConta2) {
		// TODO Auto-generated constructor stub
	}

	// Métodods
	// sacar
	public boolean sacar(double valor){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
			
	// depositar
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	// consulatSaldo
	public abstract void exibirSaldo();
		//abstract no método força a reescrita.
	

		
	
	
	//transferir
	public void transferir(Conta conta, double valor) {
		boolean teste = this.sacar(valor);
		if(teste==true) {
		conta.depositar(valor);

	}
	
	}
	
	public static  void exibirContador() {
		System.out.println("Contas: " + contador);
		
	}
}
