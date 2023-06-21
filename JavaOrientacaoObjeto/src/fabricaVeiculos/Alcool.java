package fabricaVeiculos;

public class Alcool implements Combustivel{

	@Override
	public double abastecimento(double qtd) {	
		return qtd * 7.5;
	}

}
