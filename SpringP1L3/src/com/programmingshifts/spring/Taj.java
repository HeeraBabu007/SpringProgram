package com.programmingshifts.spring;

public class Taj 
{
	PartyPackInterface PPI;

	public Taj(PartyPackInterface pPI) 
	{
		this.PPI=pPI;
	}
	
	public void BeforeBookingAlert()
	{
		PPI.TajBookingCounter();
	}

}
