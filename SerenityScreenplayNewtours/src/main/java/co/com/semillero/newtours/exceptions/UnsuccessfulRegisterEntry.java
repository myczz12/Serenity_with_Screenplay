package co.com.semillero.newtours.exceptions;

public class UnsuccessfulRegisterEntry extends AssertionError{
	private static final long serialVersionUID = 1L;
	
	public static final String UNSUCCESSFUL_REGISTER_ENTRY = "Ensure that you fill all required data";
	public UnsuccessfulRegisterEntry (String message, Throwable cause) {
		super(message, cause);
	}
	
	public String getUnsuccessfulRegisterEntry() {
		return String.format(UnsuccessfulRegisterEntry.UNSUCCESSFUL_REGISTER_ENTRY);
	}

}
