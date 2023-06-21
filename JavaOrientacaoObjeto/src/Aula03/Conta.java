package Aula03;

import java.util.Date;

public abstract class Conta {
	
	// atributos
	protected int numeroConta, agencia;
	protected String senha;
	protected Date dataAbertura;
	protected double saldo;
	protected final Cliente cliente; //composição
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
	
	
	// Métodods
	
	// sacar
	public boolean sacar(double valor) throws SaldoInsuficiente{
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			throw new SaldoInsuficiente ("Saldo insuficiente, tente novamente");
		}
		
	}
			
	// depositar
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}
		
	//transferir
	public void transferir(Conta conta, double valor) throws SaldoInsuficiente {
		boolean teste = this.sacar(valor);
		if(teste==true) {
			conta.depositar(valor);
		}else {
			throw new SaldoInsuficiente("SALDO INSUFICIENTE PARA TRANSFERENCIA");
			
		}
	}
	
	public abstract void exibirSaldo(); //abstract no método força a reescrita.
	
	
	public static  void exibirContador() {
		System.out.println("Contas: " + contador);
		
	}
}
