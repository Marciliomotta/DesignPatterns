package Criando.Model;

import Criando.Model.Primary.PrimaryButton;
import Criando.Model.Second.SecondButton;

public class Dialog {

	public void send(TipoButton tipo) {
		Button btn = this.createButton(tipo);
		btn.onClick("Hello");
	}
	
	protected Button createButton(TipoButton tipo) {
		if(tipo == TipoButton.Primary)
			return new PrimaryButton();
		
			return new SecondButton();
	}
	
	public static void main(String[] args) {
		(new Dialog()).send(TipoButton.Primary);
	}
}
