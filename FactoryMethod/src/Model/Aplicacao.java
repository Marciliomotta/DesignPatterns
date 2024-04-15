package Model;

public abstract class Aplicacao {

	public void send() {
		Protocolo protocolo = this.createProtocolo();
		MessageRequest request = this.createRequest();
		MessageResponse response = this.createResponse();
		protocolo.open();
		request.addHeader("MESSAGE", "GET");
		protocolo.message(request, response);
		protocolo.close();
	}
	
	protected abstract MessageResponse createResponse();

	protected abstract MessageRequest createRequest();

	protected abstract Protocolo createProtocolo();

}
