package Criando.Model.Primary;

import Criando.Model.Button;

public class PrimaryButton implements Button {

	@Override
	public void onClick(String mensagem) {
		System.out.println("Enviar: " + mensagem + "\n PrimaryButton");
		
	}

}
