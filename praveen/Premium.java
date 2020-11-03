//package entity;


import java.util.Calendar;
import java.util.Date;


public class Premium extends Validation {
	
	public void premiumMember()
    {
		details();
        System.out.println("You have been successfully registered for Premium Membership");
        System.out.println("----------------------Registration Details--------------------------");
        DateInfo date = new DateInfo();
        date.getCurrentDate();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 3); 
        Date nextMonth = cal.getTime();
        System.out.println ("Expiration Date: "+" "+nextMonth);
    }


}








