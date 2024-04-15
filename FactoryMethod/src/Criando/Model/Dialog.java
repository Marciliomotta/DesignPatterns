package Criando.Model;

public abstract class Dialog {

	public void send() {
		Button btn = this.createButton();
		btn.onClick("Hello");
	}
	
	protected abstract Button createButton();
}
