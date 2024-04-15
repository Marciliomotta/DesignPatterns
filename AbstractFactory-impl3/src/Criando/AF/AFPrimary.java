package Criando.AF;

import Criando.Model.Button;
import Criando.Model.TextBox;
import Criando.Model.Primary.PrimaryButton;
import Criando.Model.Primary.PrimaryTextBox;

public class AFPrimary implements AF {

	@Override
	public Button createButton() {
		return new PrimaryButton();
	}

	@Override
	public TextBox createTextBox() {
		// TODO Auto-generated method stub
		return new PrimaryTextBox();
	}

}
