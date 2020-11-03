//package entity;

import java.util.Calendar;
import java.util.Date;

//import entity.Validation;

public class Gold extends Validation {
	public void goldMember() {
		details();
		System.out.println("You have been successfully registered for Gold Membership");
		System.out.println("----------------------Registration Details--------------------------");
		DateInfo date = new DateInfo();
		date.getCurrentDate();
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, 1);
		Date nextYear = cal.getTime();
		System.out.println("Expiration Date is " + " " + nextYear);
	}

}
