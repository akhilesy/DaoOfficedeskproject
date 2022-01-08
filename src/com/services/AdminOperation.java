package com.services;

import java.util.ArrayList;
import java.util.List;

import com.app.DataSet;
import com.model.OfficeDesk;

public class AdminOperation implements AdminOperationInterface {

	/*
	 * cancel the booking by userid
	 */
	DeskOperationInterface doi = new DeskOperation();

	@Override
	public String cancelBookingbyDeskid(int id) {
		DataSet dst = new DataSet();
		ArrayList<OfficeDesk> alst = new ArrayList<OfficeDesk>();

		alst = dst.datatest();

		for (OfficeDesk officeDesk : alst) {

			if (id == officeDesk.getDeskId()) {
				officeDesk.setBookingStatus("cancel");
				return "status of id ==" + id + "  is canceled dor the days" + officeDesk.getBookingStart() + "  " + ""
						+ officeDesk.getBookingEnd();

			} else {
				System.out.println(id + "  not found");
			}

		}

		return "status of id ==" + id + "  is canceled";

	}

	/*
	 * below method chenge the status of DeskOffice.bookingstatus as reserved in the
	 * given range and range is deskid
	 * 
	 */
	@Override
	public void reserveDesk(int range1, int range2) {
		// TODO Auto-generated method stub

	}

	@Override
	public int addDesk(int newdesknumber) {
		OfficeDesk ofdc = new OfficeDesk();
		System.out.println("existing office size  " + ofdc.getOfficesize());
		ofdc.setOfficesize(ofdc.getOfficesize() + newdesknumber);

		return ofdc.getOfficesize();

	}

	@Override
	public int removeDesk(int removedesknumber) {

		OfficeDesk ofdc = new OfficeDesk();

		System.out.println("existing office size  " + ofdc.getOfficesize());
		ofdc.setOfficesize(ofdc.getOfficesize() - removedesknumber);
		return ofdc.getOfficesize();
		// TODO Auto-generated method stub

	}

}
