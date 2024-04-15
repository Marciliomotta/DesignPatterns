package Model;

public interface MessageRequest {
	public void addHeader(String key, String value);
	public void setBody(String body);
}
