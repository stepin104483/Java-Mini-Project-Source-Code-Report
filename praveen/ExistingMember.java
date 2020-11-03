//package entity;

import java.util.*;

public class ExistingMember {
	int op;
	Scanner sc = new Scanner(System.in);

	public void memberDetails() {
		System.out.println("We have following plans:-");
		System.out.println("1.Club Details");
		System.out.println("2.Type of Membership");
		System.out.println("Enter your prefrence: ");
		op = sc.nextInt();
		switch (op) {
		case 1:
			System.out.println("Name: People's Club");
			System.out.println("Venue: Mumbai");
			System.out.println("Time: 9am to 8pm");

			break;
		case 2:
			System.out.println("1.Regular Membership");
			System.out.println("2.Preminum Membership");
			System.out.println("3.Gold Membership");

			break;

		}
	}

}
