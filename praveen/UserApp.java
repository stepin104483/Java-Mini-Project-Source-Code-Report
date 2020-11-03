//package User;

//import java.sql.SQLException;
import java.util.Scanner;

public class UserApp {

	Scanner sc = new Scanner(System.in);

	public static void displayMenu() {
		System.out.println("---------Welcome to People's Club----------");
		System.out.println(" Main Menu");
		System.out.println("1. New Member");
		System.out.println("2. Admin");
		System.out.println("3. Existing Member");
		System.out.println("4. Exit");
		System.out.println("=========================================");
	}

	public static boolean switcher(int ch, Admin admin, NewCustomer newcustomer, Validation validation, DateInfo date,
			ExistingMember em) {
		Scanner sc = new Scanner(System.in);
		switch (ch) {

		case 1:
			newcustomer.formdetails();
			date.getId();

			break;

		case 2:
			System.out.println("Enter password");
			String pass1 = sc.next();
			String pass = "admin";
			if (pass.equals(pass1)) {
				System.out.println("You are Successfully Logged in");
				admin.showFirstScreen();
			} else
				System.out.println("Invalid Password, Please try again later..");
			break;

		case 3:
			em.memberDetails();
			break;

		case 4:
			System.out.println("Exiting..");
			return false;

		default:
			System.out.println("invalid input !!!");
			break;

		}
		return true;
	}

	public static void main(String[] args) {
		Admin admin = new Admin();
		NewCustomer newcustomer = new NewCustomer();
		Validation validation = new Validation();
		DateInfo date = new DateInfo();
		ExistingMember em = new ExistingMember();
		Scanner sc = new Scanner(System.in);

		boolean var = true;

		while (var) {
			displayMenu();
			System.out.println("Please enter the choice");
			int ch = sc.nextInt();

			var = UserApp.switcher(ch, admin, newcustomer, validation, date, em);

			System.out.println("=====================================");
		}

	}

}
