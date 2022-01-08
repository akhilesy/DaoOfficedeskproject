package com.services;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.app.DataSet;
import com.model.OfficeDesk;

public class DeskOperation implements DeskOperationInterface {

	/*
	 * Test data
	 */

	LocalDate now = LocalDate.now();

	@Override
	public String firstDayOfWeek() {
		DayOfWeek firstDayOfWeek = WeekFields.of(Locale.getDefault()).getFirstDayOfWeek();
		LocalDate startoftheweek = now.with(TemporalAdjusters.previousOrSame(firstDayOfWeek));
		return startoftheweek.toString();

	}

	@Override
	public String lastDayOfWeek() {
		DayOfWeek firstDayOfWeek = WeekFields.of(Locale.getDefault()).getFirstDayOfWeek();
		DayOfWeek lastDayOfWeek = firstDayOfWeek.plus(6); // or minus(1)
		LocalDate endOfWeek = now.with(TemporalAdjusters.nextOrSame(lastDayOfWeek));
		return endOfWeek.toString();

	}

	@Override
	public String bookeddays(int year, int month, int days) {
		LocalDate date = LocalDate.of(year, month, days);
		return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		// System.out.println(formattedDate);
	}

	@Override
	public String bookedtimes(int year, int month, int days, int hour, int minuts) {
		LocalDateTime ldt = LocalDateTime.of(year, month, days, hour, minuts);
		String formattedDate2 = ldt.format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm"));
		return formattedDate2;
	}

	@Override
	public String bookingByWeek(OfficeDesk officedesk) {

		System.out.println("booking by weeked" + officedesk);
		return "booked by week the dat of week " + officedesk.getBookingStart() + " and " + officedesk.getBookingEnd();
	}

	@Override
	public String bookingByDays(OfficeDesk officedesk) {
		System.out.println(officedesk);
		return "booked by days" + officedesk.getBookingStart() + " and " + officedesk.getBookingEnd();
	}

	@Override
	public String bookingByTime(OfficeDesk officedesk) {
		System.out.println(officedesk);
		return "booked by time " + officedesk.getBookingStart() + " and " + officedesk.getBookingEnd();

	}

	@Override
	public int availableDesk() {
		// TODO Auto-generated method stub
		DataSet dst = new DataSet();
		ArrayList list = dst.datatest();
		OfficeDesk ofd = new OfficeDesk();

		return ofd.getOfficesize() - list.size();
	}

	@Override
	public List<OfficeDesk> bookedDesk() {
		// TODO Auto-generated method stub
		DataSet dst = new DataSet();
		return dst.datatest();

		// return null;
	}

}
