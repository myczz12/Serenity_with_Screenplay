package co.com.semillero.newtours.exceptions;

public class NoMatchingSubmitButton extends AssertionError{
	public static final String UNABLE_TO_SEE_SUBMIT_BUTTON = "Can't find register page, try again";
	private static final long serialVersionUID = 1L;
	public NoMatchingSubmitButton (String message, Throwable cause) {
		super(message, cause);
	}
	
	public String getNoMatchingSubmitButton() {
		return String.format(NoMatchingSubmitButton.UNABLE_TO_SEE_SUBMIT_BUTTON);
	}
}
