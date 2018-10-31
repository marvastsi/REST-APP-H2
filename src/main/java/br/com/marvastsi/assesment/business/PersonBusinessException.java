package br.com.marvastsi.assesment.business;

public class PersonBusinessException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7361301112406753583L;

	public PersonBusinessException() {
	}

	public PersonBusinessException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PersonBusinessException(String message, Throwable cause) {
		super(message, cause);
	}

	public PersonBusinessException(String message) {
		super(message);
	}

	public PersonBusinessException(Throwable cause) {
		super(cause);
	}
	
	
	
}
