package Aula03;

import java.util.Date;

public class Conta {
	
	// atributos
	private int numeroConta, agencia;
	private String senha;
	private Date dataAbertura;
	private double saldo;
	private Cliente cliente; //composição
	
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
	public void exibirSaldo() {
		System.out.println(this.cliente.getNomeTitular() + " - saldo: " + this.saldo);
	}
	
	//transferir
	public void transferir(Conta conta, double valor) {
		boolean teste = this.sacar(valor);
		if(teste==true) {
		conta.depositar(valor);

	}
	
	
	
	}
}
