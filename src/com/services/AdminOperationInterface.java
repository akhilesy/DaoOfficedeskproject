package com.services;

import com.model.OfficeDesk;

public interface AdminOperationInterface {
	

	/*
	 * cancel the booking by userid
	 */
	public String cancelBookingbyDeskid(int id);
	
	/*
	 * reserve desk for spacel events
	 */
	
	public void reserveDesk(int range1 ,int range2);
	
	/*
	 * office re- organisation, introduction or removal of desks
	 */
	
	public int addDesk(int newdesknumber);
	
	/*
	 *office re- organisation, introduction or removal of desks 
	 */
	
	public int removeDesk(int  removedesknumber);
	

}
