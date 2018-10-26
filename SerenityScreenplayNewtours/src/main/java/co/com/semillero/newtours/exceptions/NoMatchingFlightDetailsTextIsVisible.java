package co.com.semillero.newtours.exceptions;

public class NoMatchingFlightDetailsTextIsVisible extends AssertionError{
	private static final long serialVersionUID = 1L;
	public static final String NO_MATCHING_FLGHT_DETAILS_TEXT = "Unsuccessful log in, can't view the Flight details tittle";
	public NoMatchingFlightDetailsTextIsVisible (String message, Throwable cause) {
		super(message, cause);
	}
	
	public String getNoMatchingFlightDetailsTextIsVisible() {
		return String.format(NoMatchingFlightDetailsTextIsVisible.NO_MATCHING_FLGHT_DETAILS_TEXT);
	}
}
