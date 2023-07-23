package com.jspider.jdbc.customer_crud_operation_with_prepared.service;

import com.jspider.jdbc.customer_crud_operation_with_prepared.dao.CustomerDao;
import com.jspider.jdbc.customer_crud_operation_with_prepared.dto.Customer;

public class CustomerService {
	CustomerDao customerDao = new CustomerDao();
	/*
	 * insert method Start
	 */
	public Customer insertCustomerService(Customer customer)
	{
		if(customer.getCustomerId()<=9999 && customer.getCustomerId()>999)
		{
			Customer customer2 =customerDao.saveCustomer(customer);
			return customer2;
		}
		else {
			System.out.println("Please 4 Digit Pass Only");
		}
		return null;
	}
	/*
	 * insert method end
	 */
	/*
	 * update method start
	 */
	/*
	 * update Customer Name Method start
	 */
	public int updateCustomerNameService(int customerId,String customerName)
	{
		return customerDao.updateCustomerName(customerId, customerName);
	}
	/*
	 * update Customer Name Method end
	 */
	/*
	 * update Customer Email Method start
	 */
	public int updateCustomerEmailService(int customerId,String customerEmail)
	{
		return customerDao.updateCustomerEmail(customerId, customerEmail);
	}
	/*
	 * update Customer Email Method end
	 */
	/*
	 * update Customer Phone Method start
	 */
	public int updateCustomerPhoneService(int customerId,long customerPhone)
	{
		return customerDao.updateCustomerPhone(customerId, null);
		
	}
	/*
	 * update Customer Phone Method end
	 */
	/*
	 * update Customer Address Method start
	 */
	public int updateCustomerAddressService(int customerId,String customerAddress)
	{
		return customerDao.updateCustomerAddress(customerId, customerAddress);
	}
	/*
	 * update Customer Address Method end
	 */
	/*
	 * update method end
	 */
	/*
	 * Display Customer Details method start
	 */
	public void displayCustomerDetailsService()
	{
		customerDao.displayCustomerDetails();
	}
	/*
	 * Display Customer Details method start
	 */
	/*
	 * Delete Customer Details method start
	 */
	public int deleteCustomerServie(int customerId)
	{
		return customerDao.deleteCustomerDetails(customerId);
		
	}
	/*
	 * Delete Customer Details method end
	 */
}
