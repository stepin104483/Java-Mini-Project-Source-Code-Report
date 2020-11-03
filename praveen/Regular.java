//package entity;


import java.util.Calendar;
import java.util.Date;

public class Regular extends Validation{
	public void regularMember()
    {
		details();
        System.out.println("You have been successfully registered for Regular Membership");
        System.out.println("----------------------Registration Details--------------------------");
        DateInfo date = new DateInfo();
        date.getCurrentDate();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 1); 
        Date nextMonth = cal.getTime();
        System.out.println ("Expiration Date is "+" "+nextMonth);
    }

}





