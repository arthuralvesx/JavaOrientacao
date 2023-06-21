package fabricaVeiculos;

public class Carro extends Veiculo{
	
	public Carro(String modelo, String cor, String tipo) {
		super(modelo, cor, tipo);
		//this.setQtd_rodas(4);
		setFabrica();
		setQtd_rodas();
	}
	
	public void setFabrica() {
		if(this.getModelo().equalsIgnoreCase("Joy Black")) {
			this.setMarca("Crevrolet");
			this.setFabrica("Crevrolet");
			this.setTransmissao("Manual");
		}else if(this.getModelo().equalsIgnoreCase("Meriva")) {
			this.setMarca("Chevrolet");
			this.setFabrica("Chevrolet");
			this.setTransmissao("Manual");
		}else if(this.getModelo().equalsIgnoreCase("Fiat Argo")) {
			this.setMarca("Fiat");
			this.setFabrica("Fiat");
			this.setTransmissao("Manual");
		}	else if(this.getModelo().equalsIgnoreCase("Paratti")) {
			this.setMarca("Volkswagen");
			this.setFabrica("Volkswagen");
			this.setTransmissao("Manual");
		}	
	}
	public void setQtd_rodas() {
		this.setQtd_rodas(4);
	}
	
	

}
