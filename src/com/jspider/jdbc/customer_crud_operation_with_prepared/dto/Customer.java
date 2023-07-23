package com.jspider.jdbc.customer_crud_operation_with_prepared.dto;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerEmail;
	private long customerPhone;
	private String customerAddress;
	
	/*
	 *  customer contractor without parameterizes Started 
	 */
	public Customer() {
		super();
	}
	/*
	 *  customer contractor without parameterizes ended 
	 */
	/*
	 *  customer contractor with parameterizes Started 
	 */
	public Customer(int customerId, String customerName, String customerEmail, long customerPhone,
			String customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
		this.customerAddress = customerAddress;
	}
	/*
	 *  customer contractor with parameterizes ended 
	 */
	/*
	 *  customer getter() and setter()  Started 
	 */
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public long getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	
	/*
	 *  customer getter() and setter()  ended 
	 */
	/*
	 *  customer toString()  Started 
	 */
	@Override
	public String toString() {
		return "";
	}
	/*
	 *  customer toString()  ended 
	 */
}
