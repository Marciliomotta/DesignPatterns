package Criando.Model.Second;

import Criando.Model.Button;
import Criando.Model.Dialog;

public class SecondDialog extends Dialog {

	public static void main(String[] args) {
		new SecondDialog().send();

	}

	@Override
	protected Button createButton() {		
		return new SecondButton();
	}

}
