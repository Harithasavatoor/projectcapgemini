package com.capgemini.medicalstoremanagment.exception;

public class TryToOrder {
	public void order(String medicinestoreinfo) throws OrderNotPossibleException {
		String order=null;
		if(order==medicinestoreinfo) {
			throw new OrderNotPossibleException("order not possible");
		}else {
			System.out.println("You can only view the details, Order is not Possible");
		}
	}

}
