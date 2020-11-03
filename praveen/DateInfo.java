//package entity;

import java.util.*;
import java.text.*;

public class DateInfo {

	public void getId() {
		UUID uniqueKey = UUID.randomUUID();
		System.out.println("Membership Id: " + uniqueKey);
	}

	public void getCurrentDate() {
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		System.out.println("Registration Date: " + today);
	}

}
