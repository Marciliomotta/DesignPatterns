package Criando.Model;

import Criando.AF.AF;
import Criando.AF.AFSecond;

public class Dialog {

	public void send() throws Exception {
		
		AF AF = new AFSecond();
		
		Button btn = (Button) AF.createItem("Button");
		TextBox txt = (TextBox) AF.createItem("TextBox");
		btn.onClick();
		txt.onClick();
	}
	public static void main(String[] args) throws Exception {
		(new Dialog()).send();
	}
}
