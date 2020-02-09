package com.capgemini.medicalstoremanagment.exception;

public class OrderNotPossibleException extends RuntimeException {
	String msg="order not possible";
	

	public OrderNotPossibleException() {
		super();
	}

  public OrderNotPossibleException(String msg) {
		super();
		this.msg = msg;
	}

	

}
