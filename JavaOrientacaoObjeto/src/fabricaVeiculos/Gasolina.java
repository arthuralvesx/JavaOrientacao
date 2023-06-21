package fabricaVeiculos;

public class Gasolina implements Combustivel {

	@Override
	public double abastecimento(double qtd) {	
		return qtd * 10;
	}

}
