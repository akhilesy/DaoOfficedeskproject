package com.services;

import java.util.ArrayList;
import java.util.List;

import com.model.OfficeDesk;

public interface DeskOperationInterface {

	List Contacts = new ArrayList<OfficeDesk>();

	/*
	 * booking sheets for a week
	 */
	public String bookingByWeek(OfficeDesk officedesk);

	/*
	 * booking sheets for a days
	 */
	public String bookingByDays(OfficeDesk officedesk);

	/*
	 * booking sheets for a time period
	 */

	public String bookingByTime(OfficeDesk officedesk);

	/*
	 * check the desk available for next client
	 */
	public int availableDesk();

	/*
	 * show all the booked desk
	 */
	public List<OfficeDesk> bookedDesk();

	public String firstDayOfWeek();

	public String lastDayOfWeek();

	public String bookeddays(int year, int month, int days);

	public String bookedtimes(int year, int month, int days, int hour, int minuts);
}
