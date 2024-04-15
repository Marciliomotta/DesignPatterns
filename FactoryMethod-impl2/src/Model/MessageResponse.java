package Model;

public interface MessageResponse {
	public void addHeader(String key, String value);
	public void setBody(String body);
}
