package fabricaVeiculos;

public class Moto extends Veiculo{

	public Moto(String modelo, String cor, String tipo) {
		super(modelo, cor, tipo);
		//this.setQtd_rodas(2);
		setFabrica();
		//Automaticamente vai chamar a funçao e defina-la para 2
		setQtd_rodas();
	}
	public void setFabrica() {
		if(this.getModelo().equalsIgnoreCase("Twister")) {
			this.setMarca("Honda");
			this.setFabrica("Honda");
			this.setTransmissao("Corrente");
		}else if(this.getModelo().equalsIgnoreCase("Titan 160")) {
			this.setMarca("Honda");
			this.setFabrica("Honda");
			this.setTransmissao("Corrente");
		}else if(this.getModelo().equalsIgnoreCase("Honda CG 160")) {
			this.setMarca("Honda");
			this.setFabrica("Honda");
			this.setTransmissao("Corrente");
		}	else if(this.getModelo().equalsIgnoreCase("Yamaha YBR 150")) {
			this.setMarca("Yamaha");
			this.setFabrica("Yamaha");
			this.setTransmissao("Corrente");
		}	
	}
	public void setQtd_rodas() {
		this.setQtd_rodas(2);
	}

}
