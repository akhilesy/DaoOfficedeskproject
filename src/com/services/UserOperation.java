package com.services;

import com.model.User;

public class UserOperation implements UserOperationInterface {

	/*
	 * test data
	 */
	User userobj = new User(5, "Akhilesh", "kushinagar", "56");

	@Override
	public User userDetails(int user) {
		// TODO Auto-generated method stub
		if (user == userobj.getUserid()) {
			return userobj;
		}

		return userobj;
	}

}
