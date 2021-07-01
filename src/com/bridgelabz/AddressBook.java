package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	
	static ArrayList<Address> list = new ArrayList<Address>();
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
			System.out.println("Choose Operation you want to do");
			System.out
					.println("1. Add ");
			switch (s.nextInt()) {
			case 1:
				add();
				break;
			}
			
	}

	private static void add() {
		Address person = new Address();
		
		System.out.println("Enter the First name:");
		String fname = s.next();
		person.setFname(fname);

		System.out.println("Enter the Last name:");
		String lname = s.next();
		person.setLname(lname);

		System.out.println("Enter the Phone Number:");
		Long phone = s.nextLong();
		person.setPhonenumber(phone);
		
		list.add(person);
		System.out.println(person);

		
	}
}