package Criando.AF;

import Criando.Model.Button;
import Criando.Model.Item;
import Criando.Model.TextBox;
import Criando.Model.Primary.PrimaryButton;
import Criando.Model.Primary.PrimaryTextBox;

public class AFPrimary implements AF {

	public Item createItem(String itemName)  throws Exception {
		if(itemName.equalsIgnoreCase("Button"))
			return new PrimaryButton();
		else if(itemName.equalsIgnoreCase("TextBox"))
			return new PrimaryTextBox();
		else
			throw new Exception("ItemIndefinido"); 
	}
			

}
