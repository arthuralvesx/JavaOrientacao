package fabricaVeiculos;

public class Executavel {

	public static void main(String[] args) {


		Carro carro = new Carro(null, null, null);
		Alcool alcool = new Alcool();
		Gasolina gasolina = new Gasolina();
		
		carro.abastecimento(gasolina, 10);
		carro.abastecimento(alcool, 0);
		carro.abastecimento(gasolina, 10);
		
		
//		System.out.println("Quantidade no Tanque: " + carro.getqtdNoTanque());
//		System.out.println("Rendimento: " + carro.getabastecimento());
		
		

	}

}
