package fabricaVeiculos;

public class Caminhao extends Veiculo {

	public Caminhao(String modelo, String cor, String tipo) {
		super(modelo, cor, tipo);
		//this.setQtd_rodas(4);
		setFabrica();
	}
	public void setFabrica() {
		if(this.getModelo().equalsIgnoreCase("New actros")) {
			this.setMarca("Merceds Benz");
			this.setFabrica("Merceds benz");
			this.setTransmissao("Automatico");
			this.setCarroceria("Caminhonete");
			
			setQtd_rodas(6);
		}else if(this.getModelo().equalsIgnoreCase("FH 540 6x4T")) {
			this.setMarca("Volvo");
			this.setFabrica("Volvo");
			this.setTransmissao("Manual");
			this.setCarroceria("Truck");
			setQtd_rodas(6);

		}else if (this.getModelo().equalsIgnoreCase("R 450 A4x2NA")) {
		this.setMarca("SCANIA");
		this.setFabrica("SCANIA");
		this.setTransmissao("Manual");
		this.setCarroceria("Truck");
	
		setQtd_rodas(4);

		}	
	}
	public void setQtd_rodas(int roda) {
		this.setQtd_rodas(roda);
	}
}
