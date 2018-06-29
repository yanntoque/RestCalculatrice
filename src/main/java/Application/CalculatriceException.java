package Application;

public class CalculatriceException extends Exception {
	
	private final int code;
	private final String defaultMessage;

	public CalculatriceException(int code, String defaultMessage){
		this.code = code;
		this.defaultMessage = defaultMessage;
	}

	public int getCode(){
		return code;
	}		
	
	public String getMessage() {
		return defaultMessage;
	}
	
}
