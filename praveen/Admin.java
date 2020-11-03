//package entity;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Admin {
	private String membership;

	public void showFirstScreen() {

		System.out.println("Hello Admin, Would you like to update? :\n  1. yes \n  2. no");
		Scanner sc = new Scanner(System.in);
		int choice = Integer.parseInt(sc.nextLine());
		switch (choice) {
		case 1:
			System.out.println("Which type of membership would you like to add in current system");
			membership = sc.next();
			System.out.println(membership + " membership added successfully");
			break;
		case 2:
			System.out.println("Exiting..");
			break;

		}
	}

}
