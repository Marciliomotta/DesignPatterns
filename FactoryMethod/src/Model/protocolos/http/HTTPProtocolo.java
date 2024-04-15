package Model.protocolos.http;

import Model.MessageRequest;
import Model.MessageResponse;
import Model.Protocolo;

public class HTTPProtocolo implements Protocolo {
	
	public static Integer PORT_DEFAULT = 80;
	public static String HOST_DEFAULT = "http.host.com";	
	
	private Integer port;
	private String  host;
	
	
	public HTTPProtocolo() {
		this(HTTPProtocolo.HOST_DEFAULT, HTTPProtocolo.PORT_DEFAULT);
	}	

	public HTTPProtocolo(Integer port) {
		this(HTTPProtocolo.HOST_DEFAULT, port);
	}
	
	public HTTPProtocolo(String  host) {
		this(host, HTTPProtocolo.PORT_DEFAULT);
	}
	
	public HTTPProtocolo(String  host, Integer port) {
		this.host = host;
		this.port = port;
	}
	
	public void open() {
		System.out.println("Abrindo conexão HTTP em http://" + this.host + ":" + this.port + "...");
	}
	
	
	public void message(MessageRequest request, MessageResponse response) {
		System.out.println("Enviando HTTPMessage: " + request);
		response.addHeader("HOST", this.host);
		response.addHeader("PORT", String.valueOf(this.port));
	}	
	
	
	public void close() {
		System.out.println("Fechando conexão HTTP em http://" + this.host + ":" + this.port + "...");
	}
		
	
	
	
	

}