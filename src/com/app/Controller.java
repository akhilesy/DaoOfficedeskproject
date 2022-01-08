package com.app;

import java.util.ArrayList;
import java.util.List;

import com.model.OfficeDesk;
import com.services.AdminOperation;
import com.services.AdminOperationInterface;
import com.services.DeskOperation;
import com.services.DeskOperationInterface;
import com.services.UserOperation;
import com.services.UserOperationInterface;

public class Controller {

	/*
	 * Test data
	 */

	DeskOperationInterface doi = new DeskOperation();

	String first_day_of_week = doi.firstDayOfWeek();
	String last_day_of_week = doi.lastDayOfWeek();
	String book_by_days = doi.bookeddays(2021, 12, 31);
	String book_by_time_and_date_start = doi.bookedtimes(2021, 12, 31, 03, 30);
	String book_by_time_and_date_end = doi.bookedtimes(2021, 12, 31, 04, 30);

	UserOperationInterface operation = new UserOperation();
	AdminOperationInterface adminoppr = new AdminOperation();
	OfficeDesk officeDesk = new OfficeDesk(6, "booked", 25, first_day_of_week, last_day_of_week);

	public void run() {

		System.out.println("Welcome to ACME Application");
		System.out.println("Uncomment the controller class method to execute ------->");

		/*
		 * below all the method calling with test data and test data also created in
		 * Dataset.java class use this test data and test your application
		 * 
		 */

		// calling userdetails methd
		// System.out.println(operation.userDetails(5));

		// calling bookbyweek method by deskoperation class
		// System.out.println(doi.bookingByWeek(officeDesk));

		// calling booking by days
		// doi.bookingByDays(officeDesk);

		// booking by time and date
		// System.out.println(doi.bookingByTime(officeDesk));

		/*
		 * to check all the booked desk with details
		 *
		 * List<OfficeDesk> lst = new ArrayList<OfficeDesk>(); lst = doi.bookedDesk();
		 * for (OfficeDesk officeDesk : lst) { System.out.println(officeDesk);
		 * 
		 * }
		 */

		// find the available size
		// System.out.println(doi.availableDesk());

		/*
		 * cancel the booking of a desk
		 * System.out.println(adminoppr.cancelBookingbyDeskid(105));
		 * 
		 * 
		 * List<OfficeDesk> lst1 = new ArrayList<OfficeDesk>(); lst1 = doi.bookedDesk();
		 * for (OfficeDesk officeDesk : lst1) { System.out.println(officeDesk);
		 * 
		 * }
		 */

		/*
		 * adding the desk in desk size System.out.println(adminoppr.addDesk(5));
		 * 
		 * removing the desk in desk size System.out.println(adminoppr.removeDesk(3));
		 * 
		 */

	}

}
