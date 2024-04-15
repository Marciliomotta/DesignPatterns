package Criando.Model;

import Criando.AF.AF;
import Criando.AF.AFPrimary;
import Criando.AF.AFSecond;

public class Dialog {

	public void send() {
		AF AF = new AFSecond();
		Button btn = AF.createButton();
		TextBox txt = AF.createTextBox();
		btn.onClick();
		txt.onClick();
	}
	
	public static void main(String[] args) {
		(new Dialog()).send();
	}

}
