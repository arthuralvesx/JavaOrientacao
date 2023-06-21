package fabricaVeiculos;


import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// Perguntamos e armazenamos qual o tipo de veiculo o usuario deseja
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(null,"qual tipo de veiculo você deseja? \n1)Carro\n2)Moto\n3)Caminhao"));
		
		//Exibir modelos disponiveis e informações digitas pelo usuario
		switch (escolha) {
		//Caso usuario digite 1 irá entrar nesse case
		case 1:
			JOptionPane.showInputDialog(null, "Os modelo disponiveis são:\nJoy Black\nMeriva\nFiat Argo\nParatti");
			
			String modeloCarro = JOptionPane.showInputDialog(null,"Digite o modelo do veiculo");
			String corCarro = JOptionPane.showInputDialog(null,"Digite a cor do veiculo");
			String tipoCarro =JOptionPane.showInputDialog(null,"Digite o tipo do veiculo\nSedan\nHatchback\nOff road");
			//instacia do objeto carro
			Carro c2 = new Carro(modeloCarro,corCarro,tipoCarro);
			
			//aqui exibira os dados do veiculo
			JOptionPane.showInputDialog(null,"-----Informações do Carro-----\nMarca: "+c2.getMarca()+"\nModelo: " + c2.getModelo()+"\nCor: " +c2.getCor()+ "\nTipo: " + c2.getTipo()+"\nFabricante: "  + c2.getFabrica()+"\nQuantidade rodas: " + c2.getQtd_rodas()+"\nTipo de transmissao: "+ c2.getTransmissao());

			while (true) {
				int op = Integer.parseInt(JOptionPane.showInputDialog(null,"O que deseja fazer?\n1)Acelerar\n2)Freiar\n3)Ligar\n4)Desligar\nDigite Qualquer Numero para finalizar o programa"));
				switch(op) {
				case 1:	
					JOptionPane.showInputDialog(null, "Km por hora: " + c2.acelerar(10));
					break;
				case 2:
					JOptionPane.showInputDialog(null, "Km por hora:" + c2.freiar(10));
					break;
				case 3:
					c2.ligar();
					JOptionPane.showInputDialog(null, "Estado do carro: Ligado");
					break;
				case 4:
					c2.desligar();
					JOptionPane.showInputDialog(null, "Estado do carro: Desligado");
					break;
				default:
					System.exit(0);
					break;
				}
			}
		case 2:
			JOptionPane.showInputDialog(null, "Os modelo disponiveis são:\nTwister\nTitan 160\nHonda CG 160\nYamaha YBR 150");
		
			String modelomoto = JOptionPane.showInputDialog(null,"Digite o modelo do veiculo");
			String corMoto= JOptionPane.showInputDialog(null,"Digite a cor do veiculo");
			String tipoMoto = JOptionPane.showInputDialog(null,"Digite o tipo do veiculo \nScooter\nTurismo\nTrail");
			//Instacia do objeto moto
			Moto m1 = new Moto(modelomoto,corMoto,tipoMoto);
			//aqui exibira os dados do veiculo
			JOptionPane.showInputDialog(null,"-----Informações da Moto-----\nMarca: "+m1.getMarca()+"\nModelo: " + m1.getModelo()+"\nCor: " + m1.getCor()+ "\nTipo: " + m1.getTipo() + "\nFabricante: "  + m1.getFabrica()+"\nQuantidade rodas: " + m1.getQtd_rodas()+"\nTipo de transmissao: "+ m1.getTransmissao());

			while (true) {
				int op = Integer.parseInt(JOptionPane.showInputDialog(null,"O que deseja fazer?\n1)Acelerar\n2)Freiar\n3)Ligar\n4)Desligar\nDigite Qualquer Numero para finalizar o programa"));
				switch(op) {
				case 1:	
					JOptionPane.showInputDialog(null, "Km por hora: " + m1.acelerar(10));
					break;
				case 2:
					JOptionPane.showInputDialog(null, "Km por hora:" + m1.freiar(10));
					break;
				case 3:
					m1.ligar();
					JOptionPane.showInputDialog(null, "Estado do carro: Ligado");
					break;
				case 4:
					m1.desligar();
					JOptionPane.showInputDialog(null, "Estado do carro: Desligado");
					break;
				default:
					System.exit(0);
					break;
				}
			}
			
		case 3:
			JOptionPane.showInputDialog(null, "Os modelo disponiveis são:\nNew actros\nFH 540 6x4T\nR 450 A4x2NA");
			
			String modeloCaminhao =JOptionPane.showInputDialog(null,"Digite o modelo do veiculo");
			String corCaminhao = JOptionPane.showInputDialog(null,"Digite a cor do veiculo");
			String tipoCaminhao = JOptionPane.showInputDialog(null,"Digite o tipo do veiculo \nGrande Baixa\nCaçamba\nBáu");
			//instacia do objeto caminhao
			Caminhao c3 = new Caminhao(modeloCaminhao,corCaminhao,tipoCaminhao);
			//aqui exibira os dados do veiculo
			JOptionPane.showInputDialog(null,"-----Informações do Caminhão-----\nMarca: "+c3.getMarca()+"\nModelo: " + c3.getModelo()+"\nCor: " + c3.getCor()+ "\nTipo: " + c3.getTipo() + "\nFabricante: "  + c3.getFabrica()+"\nQuantidade rodas: " + c3.getQtd_rodas()+"\nTipo de transmissao: "+ c3.getTransmissao());

			while (true) {
				int op = Integer.parseInt(JOptionPane.showInputDialog(null,"O que deseja fazer?\n1)Acelerar\n2)Freiar\n3)Ligar\n4)Desligar\nDigite Qualquer Numero para finalizar o programa"));
				switch(op) {
					case 1:	
						JOptionPane.showInputDialog(null, "Km por hora: " + c3.acelerar(10));
						break;
					case 2:
						JOptionPane.showInputDialog(null, "Km por hora:" + c3.freiar(10));
						break;
					case 3:
						c3.ligar();
						JOptionPane.showInputDialog(null, "Estado do carro: Ligado");
						break;
					case 4:
						c3.desligar();
						JOptionPane.showInputDialog(null, "Estado do carro: Desligado");
						break;
					default:
						System.exit(0);
						break;
				} 
			}

			//"defaut" ele serve para caso nao entre em nenhum "case" enviar uma mensagem ao usuario 
		 default:
			  Object[] options = {"OK"};
		      JOptionPane.showOptionDialog(null,"Digite um veiculo correto por favor! ", "Aviso", JOptionPane.DEFAULT_OPTION,,null, options, options[0]);
			
		}
	
	}
	

}
