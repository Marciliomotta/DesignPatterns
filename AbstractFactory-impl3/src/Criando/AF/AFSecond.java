package Criando.AF;

import Criando.Model.Button;
import Criando.Model.TextBox;
import Criando.Model.Second.SecondButton;
import Criando.Model.Second.SecondTextBox;

public class AFSecond implements AF {

	@Override
	public Button createButton() {
		return new SecondButton();
	}

	@Override
	public TextBox createTextBox() {
		// TODO Auto-generated method stub
		return new SecondTextBox();
	}

}
