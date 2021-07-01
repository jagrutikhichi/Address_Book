package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class AddressBook {
	
	static ArrayList<Address> list = new ArrayList<Address>();
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
			System.out.println("Choose Operation you want to do");
			System.out
					.println("1. Add  2.Edit  3.Delete ");
			switch (s.nextInt()) {
			case 1:
				add();
				break;
			case 2:
				edit();
				break;
			case 3:
				delete();
				break;
			}
			
	}

	private static void delete() {
		System.out.println("Enter your First name:");
		String fname = s.next();

		Iterator<Address> iterator = list.listIterator();
		while (iterator.hasNext()) {
			Address person = iterator.next();

			if (fname.equals(person.getFname())) {
				list.remove(person);
			}
		}	
	}

	private static void edit() {
		// TODO Auto-generated method stub
		System.out.println("Enter your First name:");
		String fname = s.next();

		Iterator<Address> iterator = list.listIterator();

		while (iterator.hasNext()) {
			Address person = iterator.next();

			if (fname.equals(person.getFname())) {
				System.out.println("Choose field you want to add:");
				System.out
						.println("1.Last Name\t2.Phone Number ");
				switch (s.nextInt()) {
				case 1:
					System.out.println("Re-Correct your lastname");
					person.setLname(s.next());
					break;
				case 2:
					System.out.println("Re-Correct your Phone Number");
					person.setPhonenumber(s.nextLong());
					break;
				}

			}
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