package com.jspider.jdbc.customer_crud_operation_with_prepared.controller;

import java.util.Scanner;

import com.jspider.jdbc.customer_crud_operation_with_prepared.dto.Customer;
import com.jspider.jdbc.customer_crud_operation_with_prepared.service.CustomerService;


public class CustomerController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Customer customer = null;

		CustomerService customerService = new CustomerService();

		System.out.println("-----Enter your Option-----");
		System.out.println("1.Insert\n2.Update\n3.Display Dtails\n4.Delete Customer Details");
		System.out.println("---------------------------------------");

		int option = scanner.nextInt();

		switch (option) {
		case 1:{
			System.out.println("Enter Customer id");
			int id = scanner.nextInt();
			System.out.println("Enter customer name");
			String name = scanner.next();
			System.out.println("Enter customer email");
			String email = scanner.next();
			System.out.println("Enter customer phone");
			long phone = scanner.nextLong();
			System.out.println("Enter customer address");
			String address = scanner.next();
			
			customer = new Customer(id, name, email, phone,address);

			customerService.insertCustomerService(customer);
			
		}
		break;
		case 2:{
			System.out.println("1.Name\n2.Email\n3.Phone\n4.Address");
			System.out.println("Plaese Choose Your Data---");

			int option1 = scanner.nextInt();
			switch(option1)
			{
			case 1:{
				System.out.println("-----Enter Customer Id-----");
				int id = scanner.nextInt();
				System.out.println("-----Enter updated Name-----");
				String name =scanner.next();
				
				int a = customerService.updateCustomerNameService(id,name);
				
				if(a==1)
				{
					System.out.println("-----Name is Updated-----");
				}
				else
				{
					System.out.println("-----id Mismatch-----Please check id once-----");
				}
			}
				break;
			case 2:{
				System.out.println("-----Enter Customer Id-----");
				int id = scanner.nextInt();
				System.out.println("-----Enter updated Email-----");
				String email =scanner.next();
				
				int b = customerService.updateCustomerEmailService(id,email);
				
				if(b==1)
				{
					System.out.println("-----Email is Updated-----");
				}
				else
				{
					System.out.println("-----id Mismatch-----Please check id once-----");
				}
			}
				break;
			case 3:
			{
				System.out.println("-----Enter Customer Id-----");
				int id = scanner.nextInt();
				System.out.println("-----Enter updated Phone-----");
				long phone =scanner.nextLong();
				
				int c = customerService.updateCustomerPhoneService(id,phone);
				
				if(c==1)
				{
					System.out.println("-----Phone is Updated-----");
				}
				else
				{
					System.out.println("-----id Mismatch-----Please check id once-----");
				}
			}
					break;
			case 4:{
				System.out.println("-----Enter Customer Id-----");
				int id = scanner.nextInt();
				System.out.println("-----Enter updated Address-----");
				String name =scanner.next();
				
				int d = customerService.updateCustomerAddressService(id,name);
				
				if(d==1)
				{
					System.out.println("-----Address is Updated-----");
				}
				else
				{
					System.out.println("-----id Mismatch-----Please check id once-----");
				}
			}
			break;
			}
		}
		break;
		case 3:{
			customerService.displayCustomerDetailsService();
		}
		break;
		case 4:{
			System.out.println("-----Enter Customer Id +++++ you want to delete-----");
			int id = scanner.nextInt();
			
			int del = customerService.deleteCustomerServie(id);
			if(del==1)
			{
				System.out.println("-----Delete Customer Details------");
			}
			else
			{
				System.out.println("-----id Mismatch-----Please check id once-----");
			}
		}
		}
	}
}
