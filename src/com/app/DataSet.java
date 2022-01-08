package com.app;

import java.util.ArrayList;
import java.util.List;

import com.model.OfficeDesk;

public class DataSet {

	public static ArrayList<OfficeDesk> datatest() {
		OfficeDesk ofd =  new OfficeDesk(01, "booked", 1, "30/05/2021", "31/05/2021");
		OfficeDesk ofd2 = new OfficeDesk(02, "booked", 2, "30/05/2021", "31/05/2021");
		OfficeDesk ofd3 = new OfficeDesk(03, "booked", 3, "30/05/2021", "31/05/2021");
		OfficeDesk ofd4 = new OfficeDesk(04, "booked", 4, "30/05/2021", "30/05/2021");
		OfficeDesk ofd5 = new OfficeDesk(05, "booked", 5, "30/05/2021 09:00", "30/05/2021 10:00");

		ArrayList<OfficeDesk> list = new ArrayList<OfficeDesk>();
		System.out.println(list.size());

		list.add(ofd);
		list.add(ofd2);
		list.add(ofd3);
		list.add(ofd4);
		list.add(ofd5);
		System.out.println(list.size());

		return list;
	}
	
		
	
}
