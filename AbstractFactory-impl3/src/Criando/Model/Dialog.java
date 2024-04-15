package Criando.Model;

import Criando.AF.AF;
import Criando.AF.AFPrimary;

public class Dialog {

	public void send(AF AF) {
				
		Button btn = AF.createButton();
		TextBox txt = AF.createTextBox();
		btn.onClick();
		txt.onClick();
	}

}
