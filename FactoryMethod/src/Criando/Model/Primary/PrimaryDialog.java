package Criando.Model.Primary;

import Criando.Model.Button;
import Criando.Model.Dialog;

public class PrimaryDialog extends Dialog {

	public static void main(String[] args) {
		(new PrimaryDialog()).send();

	}
	@Override
	protected Button createButton() {
		return new PrimaryButton();
	}

}