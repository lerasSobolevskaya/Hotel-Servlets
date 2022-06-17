package by.sobol.project.hotel.web.util;

public class RequestParamValidationException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2989895594657510129L;

	public RequestParamValidationException() {
	}

	public RequestParamValidationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public RequestParamValidationException(String message, Throwable cause) {
		super(message, cause);
	}

	public RequestParamValidationException(String message) {
		super(message);
	}

	public RequestParamValidationException(Throwable message) {
		super(message);
	}

	

}
