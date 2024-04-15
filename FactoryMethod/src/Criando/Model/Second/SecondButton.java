package Criando.Model.Second;

import Criando.Model.Button;

public class SecondButton implements Button {

	@Override
	public void onClick(String mensagem) {
		System.out.println("Enviar: " + mensagem + "\n SecondButton");
		
	}

}
