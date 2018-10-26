package co.com.semillero.newtours.exceptions;

public class NoInternetConnection extends AssertionError {
	private static final long serialVersionUID = 1L;
	public static final String NO_INTERNET_CONNECTION = "Check internet connection";
	public NoInternetConnection (String message, Throwable cause) {
		super(message, cause);
	}
	
	public String getNoInternetConnection() {
		return String.format(NoInternetConnection.NO_INTERNET_CONNECTION);
	}
}
