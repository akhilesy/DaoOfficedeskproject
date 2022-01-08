package com.model;



public class OfficeDesk {
	
	private int deskId;
	private String bookingStatus;
	private int deskbookingid;
	private String bookingStart;
    private String bookingEnd;
    private static  int officesize=50;
    
    
    
    
    
    
	public static int getOfficesize() {
		return officesize;
	}
	public static void setOfficesize(int officesize) {
		OfficeDesk.officesize = officesize;
	}
	
	
	public OfficeDesk(int deskId, String bookingStatus, int deskbookingid, String bookingStart, String bookingEnd) {
		super();
		this.deskId = deskId;
		this.bookingStatus = bookingStatus;
		this.deskbookingid = deskbookingid;
		this.bookingStart = bookingStart;
		this.bookingEnd = bookingEnd;
	}
	public OfficeDesk() {
		// TODO Auto-generated constructor stub
	}
	public int getDeskId() {
		return deskId;
	}
	public void setDeskId(int deskId) {
		this.deskId = deskId;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public int getDeskbookingid() {
		return deskbookingid;
	}
	public void setDeskbookingid(int deskbookingid) {
		this.deskbookingid = deskbookingid;
	}
	public String getBookingStart() {
		return bookingStart;
	}
	public void setBookingStart(String date) {
		this.bookingStart = date;
	}
	public String getBookingEnd() {
		return bookingEnd;
	}
	public void setBookingEnd(String bookingEnd) {
		this.bookingEnd = bookingEnd;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "OfficeDesk [deskId=" + deskId + ", bookingStatus=" + bookingStatus + ", deskbookingid=" + deskbookingid
				+ ", bookingStart=" + bookingStart + ", bookingEnd=" + bookingEnd + "]";
	}
	
	
	
   
    

	
	

    
    
    
    
}
