package fabricaVeiculos;

import javax.swing.JOptionPane;

public abstract class Veiculo {
	//Atributos
	private String marca, modelo, tipo, cor, fabrica, carroceria, tipo_motor, transmissao;
	private int velocidade = 0, qtd_rodas;
	private boolean estado = false;
	private double qtdNoTanque;
	private double rendimentoTotal;

	//Completar auto: fabrica, quantidade de rodas, tipo_motor, transmissao
	//nome, marca, tipo, cor, modelo, tipo de roda, motor, fabrica, tipo de carroceria, tipo de motorizaçao
	//tipo de transmissão
	//quantidade de rodas, velocidade,
	
	//Contrutor
	public Veiculo (String modelo, String cor, String tipo) {
		this.modelo = modelo;
		this.cor = cor;
		this.tipo = tipo;
	}
	//Getter and Setters
	public String getMarca() {
		return marca;
	}//SetMarca difinindo um valor
	public void setMarca(String marca) {
		//this. serve para mudar o valor do atributo
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getFabrica() {
		return fabrica;
	}

	public void setFabrica(String fabrica) {
		this.fabrica = fabrica;
	}

	public String getCarroceria() {
		return carroceria;
	}

	public void setCarroceria(String carroceria) {
		this.carroceria = carroceria;
	}

	public String getTipo_motor() {
		return tipo_motor;
	}

	public void setTipo_motor(String tipo_motor) {
		this.tipo_motor = tipo_motor;
	}

	public String getTransmissao() {
		return transmissao;
	}

	public void setTransmissao(String transmissao) {
		this.transmissao = transmissao;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getQtd_rodas() {
		return qtd_rodas;
	}

	public void setQtd_rodas(int qtd_rodas) {
		this.qtd_rodas = qtd_rodas;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	//Procedimentos
		public void ligar() { // Procedimento
			this.estado = true;
		}
		public void desligar() { // Procedimento
			this.estado = false;
			if(this.velocidade > 0) {
				JOptionPane.showMessageDialog(null, "Você Desligou o veiculo em movimento!, deu ruim!!!!!","Aviso",JOptionPane.WARNING_MESSAGE);
			}
		}
		public int acelerar(int velocidade) { // função
			if(this.estado) {
				this.velocidade += velocidade;		
			} else {
				JOptionPane.showInputDialog(null, "Não foi possivel acelerar, veiculo desligado");
			}
			return this.velocidade;
		}
		public int freiar(int velocidade) { // função
			if(this.estado) {
				if(this.velocidade > 0) {
					this.velocidade -= velocidade;							
				} else {
					JOptionPane.showInputDialog(null, "Não foi possivel acelerar, veiculo desligado");
				}
			}
			return this.velocidade;
		}
		
		public void abastecimento(Combustivel comb, double qtd) {
			if(qtdNoTanque + qtd <= 50) {
				qtdNoTanque += qtd;
				rendimentoTotal += comb.abastecimento(qtd);
			}
			
	
		}	
		
	
	
}
