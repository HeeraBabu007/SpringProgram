package com.programmingshifts.spring;

import java.util.List;

public class Taj 
{
	private List staffList;

	
	public List getStaffList() {
		return staffList;
	}


	public void setStaffList(List staffList) {
		this.staffList = staffList;
	}


	public void displayStaffNames() {
		System.out.println("All Staff are: "+staffList);
		
	}
	
}
