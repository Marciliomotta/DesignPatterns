package Criando.AF;

import Criando.Model.Button;
import Criando.Model.Item;
import Criando.Model.TextBox;
import Criando.Model.Primary.PrimaryButton;
import Criando.Model.Primary.PrimaryTextBox;
import Criando.Model.Second.SecondButton;
import Criando.Model.Second.SecondTextBox;

public class AFSecond implements AF {

	public Item createItem(String itemName)  throws Exception {
		if(itemName.equalsIgnoreCase("Button"))
			return new SecondButton();
		else if(itemName.equalsIgnoreCase("TextBox"))
			return new SecondTextBox();
		else
			throw new Exception("ItemIndefinido"); 
	}
		

}
