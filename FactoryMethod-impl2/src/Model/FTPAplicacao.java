package Model;

import Model.protocolos.ftp.FTPMessageRequest;
import Model.protocolos.ftp.FTPMessageResponse;
import Model.protocolos.ftp.FTPProtocolo;

public class FTPAplicacao extends Aplicacao{

	@Override
	protected MessageResponse createResponse() {
		return new FTPMessageResponse();
	}

	@Override
	protected MessageRequest createRequest() {
		return new FTPMessageRequest();
	}

	@Override
	protected Protocolo createProtocolo() {
		return new FTPProtocolo();
	}

	public static void main(String[] args) {
		(new FTPAplicacao()).send();
	}	
	
}
