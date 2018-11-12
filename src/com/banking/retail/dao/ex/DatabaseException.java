package com.banking.retail.dao.ex;

public class DatabaseException extends Exception {

	private static final long serialVersionUID = 1L;

	public DatabaseException(String msg) {
		super(msg);
	}

	public DatabaseException() {
		super();
	}

	public DatabaseException(Throwable t) {
		super(t);
	}

}
