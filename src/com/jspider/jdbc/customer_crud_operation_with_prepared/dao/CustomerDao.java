package com.jspider.jdbc.customer_crud_operation_with_prepared.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jspider.jdbc.customer_crud_operation_with_prepared.connection.CustomerConnection;
import com.jspider.jdbc.customer_crud_operation_with_prepared.dto.Customer;

public class CustomerDao {
	Connection connection = CustomerConnection.getCustomerConnection();
	
	/*
	 *  For Insert Query Started
	 */
	public Customer saveCustomer(Customer customer)
	{
		String insertQuery = "insert into customer value(?,?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement =connection.prepareStatement(insertQuery);
			
			preparedStatement.setInt(1, customer.getCustomerId());
			preparedStatement.setString(2, customer.getCustomerName());
			preparedStatement.setString(3, customer.getCustomerEmail());
			preparedStatement.setLong(4, customer.getCustomerPhone());
			preparedStatement.setString(5, customer.getCustomerAddress());
			
			preparedStatement.execute();
			System.out.println("-----Data Store-----");
			
			return customer;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	/*
	 *  For Insert Query Ended
	 */
	/*
	 *  For Update Query Started
	 */
	/*
	 *  For Update Name Query Started
	 */
	public int updateCustomerName(int customerId,String customerName) {
		String updateName ="update customer set customerName=? where customerId=?";
		
		try {
			PreparedStatement preparedStatement  =connection.prepareStatement(updateName);
			
			preparedStatement.setInt(2, customerId);
			preparedStatement.setString(1, customerName);
			
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	/*
	 *  For Update Name Query Ended
	 */
	/*
	 *  For Update Email Query Started
	 */
	public int updateCustomerEmail(int customerId,String customerEmail) {
		String updateEmail ="update customer set customerName=? where customerId=?";
		
		try {
			PreparedStatement preparedStatement  =connection.prepareStatement(updateEmail);
			
			preparedStatement.setInt(2, customerId);
			preparedStatement.setString(1, customerEmail);
			
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	/*
	 *  For Update Email Query Ended
	 */
	/*
	 *  For Update Phone Query Started
	 */
	public int updateCustomerPhone(int customerId,String customerPhone) {
		String updatePhone ="update customer set customerName=? where customerId=?";
		
		try {
			PreparedStatement preparedStatement  =connection.prepareStatement(updatePhone);
			
			preparedStatement.setInt(2, customerId);
			preparedStatement.setString(1, customerPhone);
			
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	/*
	 *  For Update Phone Query Ended
	 */
	/*
	 *  For Update Address Query Ended
	 */
	public int updateCustomerAddress(int customerId,String customerAddress) {
		String updateAddress ="update customer set customerName=? where customerId=?";
		
		try {
			PreparedStatement preparedStatement  =connection.prepareStatement(updateAddress);
			
			preparedStatement.setInt(2, customerId);
			preparedStatement.setString(1, customerAddress);
			
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	/*
	 *  For Update Address Query Ended
	 */
	/*
	 *  For Update Query Ended
	 */
	/*
	 *  For Display Customer Details Method Started
	 */
	public void displayCustomerDetails()
	{
		String displayQuery = "select * from customer";
		
		try {
			PreparedStatement preparedStatement =connection.prepareStatement(displayQuery);
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next())
			{
				int id =resultSet.getInt("customerId");
				String name=resultSet.getString("customerName");
				String email=resultSet.getString("customerEmail");
				String phone=resultSet.getString("customerphone");
				String address=resultSet.getString("customerAddress");
				
				System.out.println("Customer Id is = "+id);
				System.out.println("Customer Name is = "+name);
				System.out.println("Customer Email is = "+email);
				System.out.println("Customer Phone is = "+phone);
				System.out.println("Customer Address is = "+address);
				
				System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 *  For Display Customer Details Method Ended
	 */
	/*
	 *  For Delete Query Started
	 */
	public int deleteCustomerDetails(int customerId)
	{
		String deleteQuery = "delete from customer where customerId=?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
			
			preparedStatement.setInt(1, customerId);
			
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	/*
	 *  For Delete Query Ended
	 */
}
