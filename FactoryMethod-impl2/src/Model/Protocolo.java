package Model;

public interface Protocolo {

	public void open();
	public void message(MessageRequest request, MessageResponse response);	
	public void close();
	
}
