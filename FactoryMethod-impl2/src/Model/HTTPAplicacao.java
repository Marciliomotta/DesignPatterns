package Model;

import Model.protocolos.http.HTTPMessageRequest;
import Model.protocolos.http.HTTPMessageResponse;
import Model.protocolos.http.HTTPProtocolo;

public class HTTPAplicacao extends Aplicacao {

	

	@Override
	protected MessageResponse createResponse() {
		return new HTTPMessageResponse();
	}
	@Override
	protected MessageRequest createRequest() {
		return new HTTPMessageRequest();
	}
	@Override
	protected Protocolo createProtocolo() {
		return new HTTPProtocolo();
	}	
	
	public static void main(String[] args) {
		(new HTTPAplicacao()).send();
	}	
	
}
