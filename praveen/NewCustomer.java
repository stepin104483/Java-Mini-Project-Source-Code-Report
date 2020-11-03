//package entity;

import java.util.*;


public class NewCustomer {
	int option;
	Scanner sc = new Scanner(System.in);

	public void formdetails() {
		System.out.println("We have following plans:-");
		System.out.println("1.Regular Membership");
		System.out.println("2.Preminum Membership");
		System.out.println("3.Gold Membership");
		System.out.println("Enter your prefrence: ");
		option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println("----- Welcome to Regular Membership plan ------ ");
			regularDetail();
			break;

		case 2:
			System.out.println("----- Welcome to Premium Membership plan ------ ");
			premiumDetail();

			break;
		case 3:
			System.out.println("----- Welcome to Gold Membership plan ------ ");
			goldDetail();
			break;

		}
	}

	public void regularDetail() {
		System.out.println("Membership valid for 1 Month and payable amount is 300rps ");
		Regular regular = new Regular();
		regular.regularMember();

	}

	public void premiumDetail() {
		System.out.println("Membership valid for 3 months and payable amount is 700rps ");

		Premium premium = new Premium();
		premium.premiumMember();
	}

	public void goldDetail() {
		System.out.println("Membership valid for 1 year and payable amount is 1700rps ");

		Gold gold = new Gold();
		gold.goldMember();
	}

}
